package com.arjunsk.Log4JExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
    	///test

    	LOGGER.debug("Experimenting Git Checkout!!!");
    	
    	
    	LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        
    }
}
