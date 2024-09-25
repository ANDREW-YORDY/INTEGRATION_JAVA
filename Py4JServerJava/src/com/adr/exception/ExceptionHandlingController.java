package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;

public class ExceptionHandlingController {

    ExceptionHandlingModel ctrx = new ExceptionHandlingModel();
    ExceptionDetailsHandler detailsHandler = new ExceptionDetailsHandler();
    StackTraceHandler stackTraceHandler = new StackTraceHandler();

    public void handleException(Exception e) {
        // Usar la clase para manejar los detalles de la excepción
        detailsHandler.setExceptionDetails(ctrx, e);

        // Usar la clase para manejar el stack trace
        stackTraceHandler.setStackTrace(ctrx, e);

        // Imprimir los detalles completos
        System.out.println("Exception Details: " + ctrx.toString());

    }

}
