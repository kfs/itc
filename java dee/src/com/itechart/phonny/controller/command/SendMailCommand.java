package com.itechart.phonny.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itechart.phonny.controller.RequestPage;

public class SendMailCommand extends AbstractCommand {
	
	public SendMailCommand() {

		super();
	}

	@Override
	public void proccess(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPageURI() {

		return RequestPage.INDEX_PAGE;
	}

}
