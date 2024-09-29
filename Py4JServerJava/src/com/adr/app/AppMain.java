package com.adr.app;

import com.adr.exception.ExceptionHandlingService;
import com.adr.log.file.ErrorControllerFile;
import java.nio.file.Paths;

public class AppMain {

    public static void main(String[] args) {
        
        //Invocación del método a correr.
        ExceptionHandlingService ctrService = new ExceptionHandlingService();
        ctrService.induceError();

        //Gestión y guardado de la excepcion generada, en un archivo .log.
        System.out.println("======================== save .log ============================");
        String logDirectory = System.getProperty("user.home") + "/logs/myapp";
        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());
        
        
        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
        ctrErrorF.runErrors();
        System.out.println("\n");

    }

}

//        

