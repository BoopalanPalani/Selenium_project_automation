package loggingFramework;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
public class Basic_Configurator_Example {
	static Logger logger = LogManager.getLogger(Basic_Configurator_Example.class);//Factory design pattern 
	
	public static void main(String[] args) {
		logger.debug("This a debug message");
		logger.warn("This is warning message");
		logger.info("This is an info");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
		
		
		
	}

}
