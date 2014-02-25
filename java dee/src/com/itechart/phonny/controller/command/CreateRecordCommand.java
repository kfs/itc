package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;
import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.dao.StorageLocator;
import com.itechart.phonny.model.entity.PhoneRecord;


public class CreateRecordCommand implements Command {

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

        System.out.println("CREATE + " + request.getParameter("record"));
        String recordEmail = (String) request.getParameter("record");
        if (recordEmail != null) {
            loadRequestedData(request, response);
		}
    }

    private void loadRequestedData(HttpServletRequest request,
			HttpServletResponse response) {

    	String recordEmail = (String) request.getParameter("record");    	
    	StorageLocator locator = StorageLocator.INSTANCE;
        PhoneRecordDAO dao = (PhoneRecordDAO) locator.getDAO(PhoneRecordDAO.class);
        PhoneRecord record = dao.getRecord(recordEmail);
        request.setAttribute("editableRecord", record);
	}

	@Override
    public String getPageURI() {

        return RequestPage.CREATE_PAGE;
    }

}
