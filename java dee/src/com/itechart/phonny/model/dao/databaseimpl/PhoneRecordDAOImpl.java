package com.itechart.phonny.model.dao.databaseimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.entity.Address;
import com.itechart.phonny.model.entity.PhoneRecord;
import com.itechart.phonny.model.entity.Workplace;


public class PhoneRecordDAOImpl implements PhoneRecordDAO {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneRecordDAOImpl.class);
	
    private static final String GET_RECORDS_SHORT_QUERY = 
			"SELECT first_name, patronymic, surname, birthdate, " +
			"email, organization, country, city, street, house_number, apartment_number, post_code " +
			"FROM (jdee.contact JOIN jdee.address) JOIN jdee.workplace " +
			"WHERE contact.address_id = address.id AND contact.workplace_id = workplace.id LIMIT ?, ?;";
	
    private static final String GET_RECORD_QUERY = "SELECT * " +
			"FROM (jdee.contact JOIN jdee.address) JOIN jdee.workplace " +
			"WHERE contact.address_id = address.id AND contact.workplace_id = workplace.id AND email = ?";
	
    private static final String GET_CONTACT_PHONES = "SELECT * FROM jdee.contact_phone " +
	                "WHERE contact_id = (SELECT id FROM jdee.contact WHERE email = ?);";
	
    private static final String GET_ATTACHMENTS = "SELECT * FROM jdee.attachment " +
	                "WHERE contact_id = (SELECT id FROM jdee.contact WHERE email = ?);";
    	
    private static final String DELETE_RECORD = "DELETE FROM jdee.attachment " +
                        "WHERE contact_id = (SELECT id FROM jdee.contact WHERE email = ?); " +
                        "DELETE FROM jdee.contact_phone " +
                        "WHERE contact_id = (SELECT id FROM jdee.contact WHERE email = ?); " +
                        "DELETE FROM jdee.contact WHERE email = ?;"; 
        
    public PhoneRecordDAOImpl() {

        super();
    }
    
    @Override
    public void create(PhoneRecord record) {

        
    }

	@Override
	public PhoneRecord getRecord(String email) {
		
		PhoneRecord record = null;
		Connection connection = null;
    	PreparedStatement statement = null;
    	try {
			connection = StorageProvider.INSTANCE.getConnection();
			statement = connection.prepareStatement(GET_RECORD_QUERY);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			record = parseRecordMainInfo(resultSet);
			Address address = parseAddress(resultSet);
			record.setAddress(address);
			Workplace workplace = parseWorkplace(resultSet);
			record.setWorkplace(workplace);
		} catch (SQLException e) {
			LOGGER.error("Failed to obtain connection:", e);
		} finally {
			closeResources(connection, statement);
		}
		return record;
	}

    @Override
    public List<PhoneRecord> getRecords(int first, int last) {

    	List<PhoneRecord> records = new ArrayList<PhoneRecord>();
    	Connection connection = null;
    	PreparedStatement statement = null;
    	try {
			connection = StorageProvider.INSTANCE.getConnection();
			statement = connection.prepareStatement(GET_RECORDS_SHORT_QUERY);
			ResultSet resultSet = executeRecordsStatement(first, last,
					statement);
			parseRecordsSet(resultSet, records);
			
		} catch (SQLException e) {
			LOGGER.error("Failed to obtain connection:", e);
		} finally {
			closeResources(connection, statement);
		}
        return records;
    }

	private ResultSet executeRecordsStatement(int first, int last,
			PreparedStatement statement) throws SQLException {
		
		statement.setInt(1, first);
		statement.setInt(2, last);
		ResultSet resultSet = statement.executeQuery();
		return resultSet;
	}

    private void parseRecordsSet(ResultSet resultSet, List<PhoneRecord> records)
    		throws SQLException {
    	
    	PhoneRecord record;
		while(resultSet.next()) {
			record = parseRecordMainInfo(resultSet);
			Address address = parseAddress(resultSet);
			record.setAddress(address);
			Workplace workplace = parseWorkplace(resultSet);
			record.setWorkplace(workplace);
			records.add(record);
		}
	}

	private PhoneRecord parseRecordMainInfo(ResultSet resultSet)
			throws SQLException {
		
		PhoneRecord record;
		record = new PhoneRecord();
		record.setFirstName(resultSet.getString(ContactColumns.FIRST_NAME));
		record.setPatronymic(resultSet.getString(ContactColumns.PATRONYMIC));
		record.setSurname(resultSet.getString(ContactColumns.SURNAME));
		record.setEmail(resultSet.getString(ContactColumns.EMAIL));
		record.setBirthDate(resultSet.getTimestamp(ContactColumns.BIRTHDATE));
		return record;
	}

	private Address parseAddress(ResultSet resultSet) throws SQLException {
		
		Address address = new Address();
		address.setCountry(resultSet.getString(AddressColumns.COUNTRY));
		address.setCity(resultSet.getString(AddressColumns.CITY));
		address.setStreet(resultSet.getString(AddressColumns.STREET));
		address.setHouseNumber(resultSet.getString(AddressColumns.HOUSE_NUMBER));
		address.setApartmentNumber(resultSet.getString(AddressColumns.APARTMENT_NUMBER));
		address.setPostCode(resultSet.getInt(AddressColumns.POST_CODE));
		return address;
	}

	private Workplace parseWorkplace(ResultSet resultSet) throws SQLException {

		Workplace workplace = new Workplace();
		workplace.setOrganization(resultSet.getString(ContactColumns.WORKPLACE));
		return workplace;
	}

	@Override
    public void update(PhoneRecord record) {

        
    }

    @Override
    public void delete(String mail) {

    	Connection connection = null;
    	PreparedStatement statement = null;
    	try {
			connection = StorageProvider.INSTANCE.getConnection();
			statement = connection.prepareStatement(DELETE_RECORD);
			statement.setString(1, mail);
			statement.setString(2, mail);
			statement.setString(3, mail);
			statement.execute();			
		} catch (SQLException e) {
			LOGGER.error("Failed to obtain connection:", e);
		} finally {
			closeResources(connection, statement);
		}
    }

	private void closeResources(Connection connection,
			PreparedStatement statement) {
		try {
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch(SQLException e) {
			LOGGER.error("DB resource closing problem:", e);
		}
	}
}
