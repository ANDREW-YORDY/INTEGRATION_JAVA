package com.adr.app;

import com.adr.exception.ExceptionDetailsHandler;
import com.adr.model.exceptions.ExceptionHandlingModel;
import com.adr.exception.StackTraceHandler;

public class AppMain {

    public static void main(String[] args) {
//
        StackTraceHandler excepSimpleImpl = new StackTraceHandler();
        //excepSimpleImpl.setStackTrace(ExecpMod, e);

    }

}

//        
//        String logDirectory = System.getProperty("user.home") + "/logs/myapptest";
//        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());   
//        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
//        ctrErrorF.runErrors();
