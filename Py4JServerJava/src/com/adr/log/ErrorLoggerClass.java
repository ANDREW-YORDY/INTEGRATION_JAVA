
package com.adr.log;

import java.util.logging.Logger;
import java.util.logging.MemoryHandler;
import java.util.logging.*;


//Clase ErrorLogger (responsable de registrar los errores)

public class ErrorLoggerClass {
    
    
    private Logger logger;
    private MemoryHandler memoryHandler;

    // Constructor para inicializar el Logger y MemoryHandler.
    public ErrorLoggerClass() {
        logger = Logger.getLogger(ErrorLoggerClass.class.getName());
        memoryHandler = new MemoryHandler( new ConsoleHandler(), 100, Level.SEVERE );
        logger.addHandler(memoryHandler);
    }
    
    
    public void logError( String errorMessage )
    {
        logger.severe(errorMessage);
    }
    
}
