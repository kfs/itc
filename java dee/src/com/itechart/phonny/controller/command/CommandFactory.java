package com.itechart.phonny.controller.command;

import java.util.HashMap;
import java.util.Map;

import com.itechart.phonny.controller.RequestURI;

public class CommandFactory {

    private static final Map<String, Command> commands;
    
    static {
        
        commands = new HashMap<String, Command>();
        Command indexCommand = new AllRecordsCommand();
        commands.put(RequestURI.INDEX_DEFAULT, indexCommand);
        commands.put(RequestURI.INDEX, indexCommand);
        commands.put(RequestURI.CREATE, new CreateRecordCommand());
        commands.put(RequestURI.SEARCH, new SearchCommand());
        commands.put(RequestURI.SEARCH_COMPLETED, new SearchCompletedCommand());
        commands.put(RequestURI.SEND_MAIL, new SendMailCommand());
    }
    
    private CommandFactory() {
        
        super();
    }
    
    public static Command getCommand(String requestedURI) {
        
        Command command = commands.get(requestedURI);
        if (command == null) {
            return new NotFoundCommand();
        } else {
            return command;
        }
    }
    
}
