package Loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2 {
	

	    private static final Logger logger = LogManager.getLogger(log4j2.class);

	    public static void main(String[] args) {
	        logger.info("Hello World!");
	        logger.debug("Hello World!!!");
	       // logger.trace("Trace the code");
	    }
	}

