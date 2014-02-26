package com.itechart.phonny.controller.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;
import com.itechart.phonny.model.PageConfig;
import com.itechart.phonny.model.dao.PhoneRecordDAO;
import com.itechart.phonny.model.dao.StorageLocator;
import com.itechart.phonny.model.entity.PhoneRecord;


public class AllRecordsCommand extends AbstractCommand {
	
	public AllRecordsCommand() {
		
		super();
	}

    @Override
    public void proccess(HttpServletRequest request,
            HttpServletResponse response) {

    	LOGGER.info("Requested >>ShowAllRecords command.");
        loadRequestedData(request);
    }

    private void loadRequestedData(HttpServletRequest request) {

        StorageLocator locator = StorageLocator.INSTANCE;
        PhoneRecordDAO dao = (PhoneRecordDAO) locator.getDAO(PhoneRecordDAO.class);
        // TODO: provide pagination
        List<PhoneRecord> records = dao.getRecords(1, 10);
        request.setAttribute(RequestAttributes.RECORD_COLLECTION, records);
        // TODO: add page-output support
        createPageConfig(request);
    }

    private void createPageConfig(HttpServletRequest request) {

        PageConfig config = new PageConfig();
        config.setHasNext(false);
        config.setHasPrevious(false);
        request.setAttribute(RequestAttributes.PAGINATION_CONFIG, config);
    }

    @Override
    public String getPageURI() {

        return RequestPage.INDEX_PAGE;
    }

}
