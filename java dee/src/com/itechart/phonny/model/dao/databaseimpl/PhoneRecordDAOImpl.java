package com.itechart.phonny.model.dao.databaseimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.entity.PhoneRecord;


public class PhoneRecordDAOImpl implements PhoneRecordDAO {
	
	private static final String GET_RECORDS_SHORT_QUERY = 
			"SELECT first_name, patronymic, surname, birthdate, " +
			"email, organization, country, city, street, house_number, appartment_number " +
			"FROM (jdee.contact JOIN jdee.address) JOIN jdee.workplace " +
			"WHERE contact.address = address.id AND contact.workplace = workplace.id LIMIT ?, ?;";
        
    public PhoneRecordDAOImpl() {

        super();
        // TODO: replace with database implementation
        /*records = new ArrayList<>();
        PhoneRecord record = new PhoneRecord();
        record.setFirstName("Anna");
        record.setLastName("HelloWorld");
        record.setEmail("anna@helloworld.com");
        record.setBirthDate(new Date());
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);*/
    }

    @Override
    public void create(PhoneRecord record) {

        
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
			// TODO log
			e.printStackTrace();
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
    	
		while(resultSet.next()) {
			
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
			// TODO log
		}
	}

	@Override
    public void update(PhoneRecord record) {

        
    }

    @Override
    public void delete(PhoneRecord record) {

        
    }
}
