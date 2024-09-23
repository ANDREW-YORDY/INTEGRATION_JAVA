package com.adr.app;

import com.adr.exception.ExceptionHandlingSimpleClassModelImpl;
import com.adr.model.exceptions.ExceptionHandlingSimpleModel;

public class AppMain {


    public static void main(String[] args) {

        ExceptionHandlingSimpleClassModelImpl excepSimpleImpl = new ExceptionHandlingSimpleClassModelImpl();
        excepSimpleImpl.exceptionSimpleGetModels();

    }

}

//        
//        String logDirectory = System.getProperty("user.home") + "/logs/myapptest";
//        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());   
//        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
//        ctrErrorF.runErrors();
