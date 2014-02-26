package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;
import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.dao.StorageLocator;
import com.itechart.phonny.model.entity.PhoneRecord;

public class UpdateRecordCommand extends AbstractCommand {

	private boolean isValidRecord;
	
	public UpdateRecordCommand() {

		super();
	}
	
	@Override
	public void proccess(HttpServletRequest request,
			HttpServletResponse response) {
		
		LOGGER.info("Requested >>Create&Update command.");
		proccessRequestParameters(request, response);
	}

	private void proccessRequestParameters(HttpServletRequest request,
			HttpServletResponse response) {
		
		PhoneRecord record = parseRecord(request);
		validateRecord(record);
		if(isValidRecord) {
			String recordEmail = (String) request.getParameter(RequestParameters.RECORD_ID);
			if (recordEmail != null) {
	            updateReceivedData(request, record);
			} else {
				createNewRecord(request, record);
			}
		}
	}

	private PhoneRecord parseRecord(HttpServletRequest request) {
			
		PhoneRecord record = new PhoneRecord();
		// TODO: parse record
		return record;
	}

	private void validateRecord(PhoneRecord record) {

		// TODO: provide validation
		isValidRecord = false;
	}

	private void updateReceivedData(HttpServletRequest request,
			PhoneRecord record) {

		LOGGER.debug(">>Create&Update command: update record.");
		StorageLocator locator = StorageLocator.INSTANCE;		
        PhoneRecordDAO dao = (PhoneRecordDAO) locator.getDAO(PhoneRecordDAO.class);
        dao.update(record);
	}

	private void createNewRecord(HttpServletRequest request,
			PhoneRecord record) {

		LOGGER.debug(">>Create&Update command: new record.");
		StorageLocator locator = StorageLocator.INSTANCE;		
        PhoneRecordDAO dao = (PhoneRecordDAO) locator.getDAO(PhoneRecordDAO.class);
        dao.create(record);
	}

	@Override
	public String getPageURI() {

		return isValidRecord ? RequestPage.INDEX_PAGE
				: RequestPage.CREATE_PAGE;
	}	

}
