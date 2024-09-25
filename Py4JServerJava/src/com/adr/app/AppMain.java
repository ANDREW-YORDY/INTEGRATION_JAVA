package com.adr.app;

import com.adr.exception.ExceptionDetailsHandler;
import com.adr.exception.ExceptionHandlingController;
import com.adr.model.exceptions.ExceptionHandlingModel;
import com.adr.exception.StackTraceHandler;
import com.adr.log.file.ErrorControllerFile;
import java.nio.file.Paths;

public class AppMain {

    public static void main(String[] args) {
        
        ExceptionHandlingController excepContr = new ExceptionHandlingController();
        //excepContr.handleException(e);

        String logDirectory = System.getProperty("user.home") + "/logs/myapptest";
        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());
        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
        ctrErrorF.runErrors();

    }

}

//        

