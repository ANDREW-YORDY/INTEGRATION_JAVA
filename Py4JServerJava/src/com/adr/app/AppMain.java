package com.adr.app;

import com.adr.log.file.ErrorControllerFile;
import java.nio.file.Paths;
import com.adr.exception.ExceptionHandlingClass;
import com.adr.exception.ExceptionHandlingSimpleClass;
import com.adr.exception.ExceptionHandlingSimpleClassModelImpl;
import com.adr.model.exceptions.ExceptionHandlingSimpleModel;


public class AppMain {

    public static void main(String[] args) {

//        ExceptionHandlingSimpleClass excepSimple = new ExceptionHandlingSimpleClass();
//        excepSimple.exceptionSimple();
        
        ExceptionHandlingSimpleClassModelImpl excepSimpleImpl = new ExceptionHandlingSimpleClassModelImpl();
        excepSimpleImpl.exceptionSimpleGetModls();

    }

}

//        System.out.println("\n");
//        
//        String logDirectory = System.getProperty("user.home") + "/logs/myapptest";
//        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());   
//        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
//        ctrErrorF.runErrors();