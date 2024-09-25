package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;

public class ExceptionDetailsHandler {

    ExceptionHandlingModel ctrx = new ExceptionHandlingModel();

    public void exceptionSimpleGetModels(ExceptionHandlingModel ExecpMod, Exception e) {

        System.out.println("(e): " + e);

        //setters:
        ctrx.setExceptionType(e.getClass().getSimpleName());
        ctrx.setExceptionMessage(e.getMessage());
        ctrx.setLocalizedMessage(e.getLocalizedMessage());
        // getCause y getSuppressed pueden ser null, entonces los manejamos con ternario:
        ctrx.setCausex(e.getCause() != null ? e.getCause().toString() : "No cause");
        ctrx.setSuppressedx(e.getSuppressed().length > 0 ? e.getSuppressed()[0].toString() : "No suppressed exceptions");

        System.out.println("\nStack Trace: \n" + ctrx.toString());
    }
}
