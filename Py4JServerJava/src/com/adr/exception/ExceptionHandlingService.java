package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;

public class ExceptionHandlingService {

    ExceptionDetailsHandler detailsHandler     = new ExceptionDetailsHandler();
    StackTraceHandler       stackTraceHandler  = new StackTraceHandler();

    // Método para inducir el error y manejar la excepción
    public void induceError() {
        try {
            int data = 50 / 0;     // Provocamos un error (división por cero)
        } catch ( Exception e )    // (e)
        {
            handleException(e);
        }
    }

    // Método para manejar la excepción usando los handlers
    private void handleException(Exception e) {
        
        ExceptionHandlingModel ExcModel = new ExceptionHandlingModel();
        
        detailsHandler.setExceptionDetails(ExcModel, e);  //manejar los detalles de la excepción
//        stackTraceHandler.setStackTrace(ExcModel, e);  //manejar el stack trace

    }

}
