package com.adr.log.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLoggerFile {

    
    private Logger logger;
    private FileHandler fileHandler;

    public ErrorLoggerFile(String logDirectory) {
        
        try {
            logger = Logger.getLogger(ErrorLoggerFile.class.getName());
            Path logPath = Paths.get(logDirectory);
            Files.createDirectories(logPath);

            String fileName = logPath.resolve("errors_"
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))
                    + ".log").toString();

            fileHandler = new FileHandler(fileName, true);
            fileHandler.setFormatter(new SimpleFormatter() {
                @Override
                public String format(LogRecord record) {
                    return String.format("[%s] %s: %s%n",
                            LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                            record.getLevel(),
                            record.getMessage()
                    );
                }
            });

            logger.addHandler(fileHandler);
            logger.setLevel(Level.SEVERE);
        } catch (IOException e) {
            System.err.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    public void logError(String errorMessage) {
        logger.severe(errorMessage);
    }

    public void closeLogger() {
        if (fileHandler != null) {
            fileHandler.close();
        }
    }
}
