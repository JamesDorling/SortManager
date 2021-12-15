package org.sort_manager.output_handler;

import java.io.IOException;
import java.util.logging.*;

public class SystemLogger {
    private final static SystemLogger SYSTEM_LOGGER = new SystemLogger();
    Logger logger = Logger.getLogger("BigLoggerooski");

    private SystemLogger() {
        try {
            Handler fileHandler = new FileHandler("src/main/resources");
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new CustomFormatter());
            //System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s [%1$tcl%n]"); //Annoying rewrite thingy
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public void logSevere(String message) {
        logger.log(Level.SEVERE, message);
    }

    public void logConfig(String message) {
        logger.log(Level.CONFIG, message);
    }
}
