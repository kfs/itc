package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;
import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.dao.StorageLocator;
import com.itechart.phonny.model.entity.PhoneRecord;


public class EditRecordCommand extends AbstractCommand {
	
	public EditRecordCommand() {

		super();
	}

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

        LOGGER.info("Requested >>Edit&UpdateView command.");
        String recordEmail = (String) request.getParameter(RequestParameters.RECORD_ID);
        if (recordEmail != null) {
            loadRequestedData(request, response);
		}
    }

    private void loadRequestedData(HttpServletRequest request,
			HttpServletResponse response) {

    	String recordEmail = (String) request.getParameter(RequestParameters.RECORD_ID);    	
    	StorageLocator locator = StorageLocator.INSTANCE;
        PhoneRecordDAO dao = (PhoneRecordDAO) locator.getDAO(PhoneRecordDAO.class);
        PhoneRecord record = dao.getRecord(recordEmail);
        request.setAttribute(RequestAttributes.RECORD, record);
        request.setAttribute(RequestAttributes.RECORD_ID, recordEmail);
	}

	@Override
    public String getPageURI() {

        return RequestPage.CREATE_PAGE;
    }

}
