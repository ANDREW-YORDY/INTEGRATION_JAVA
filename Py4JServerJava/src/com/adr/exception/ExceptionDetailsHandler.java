package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;
import java.util.Arrays;

public class ExceptionDetailsHandler {

    //ExceptionHandlingModel ctrModel = new ExceptionHandlingModel();
    public void setExceptionDetails(ExceptionHandlingModel excepModel, Exception e) {

        System.out.println("SIMPLE*");
        System.out.println("(e): " + e);
        //setters:
        excepModel.setExceptionType(e.getClass().getSimpleName());
        excepModel.setExceptionMessage(e.getMessage());
        excepModel.setLocalizedMessage(e.getLocalizedMessage());
        // getCause y getSuppressed pueden ser null, entonces los manejamos con ternario:
        excepModel.setCausex(e.getCause() != null ? e.getCause().toString() : "No cause");
        excepModel.setSuppressedx(e.getSuppressed().length > 0 ? e.getSuppressed()[0].toString() : "No suppressed exceptions");
        excepModel.setGroupStackTrace(Arrays.toString(e.getStackTrace()));
        
        System.out.println("LISTA TRACE: " + excepModel.toString() );
    }
}
