package com.itechart.phonny.controller.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractCommand implements Command {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    
}
