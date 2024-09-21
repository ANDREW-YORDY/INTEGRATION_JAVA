package com.adr.app;

import com.adr.log.file.ErrorControllerFile;
import java.nio.file.Paths;
import com.adr.exception.ExceptionHandlingClass;


public class AppMain {
    
    public static void main(String[] args) {
        
        ExceptionHandlingClass exceptionHandlingClass = new ExceptionHandlingClass();
        exceptionHandlingClass.exceptionTesting();
        
//        String logDirectory = System.getProperty("user.home") + "/logs/myapptest";
//        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());
//        
//        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
//        ctrErrorF.runErrors();
    }
    
}