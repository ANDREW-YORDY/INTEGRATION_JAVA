package com.adr.app;

import com.adr.exception.ExceptionHandlingService;
import com.adr.log.file.ErrorControllerFile;
import java.nio.file.Paths;

public class AppMain {

    public static void main(String[] args) {
        
        ExceptionHandlingService ctrService = new ExceptionHandlingService();
        ctrService.induceError();

//        String logDirectory = System.getProperty("user.home") + "/logs/myapptest";
//        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());
//        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
//        ctrErrorF.runErrors();

    }

}

//        

