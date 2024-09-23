package com.adr.app;

import com.adr.log.file.ErrorControllerFile;
import java.nio.file.Paths;

public class AppMain {

    public static void main(String[] args) {
        String logDirectory = System.getProperty("user.home") + "/logs/myapp";

        System.out.println("Los archivos de log se guardarán en: " + Paths.get(logDirectory).toAbsolutePath());

        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
        ctrErrorF.runErrors();
    }
}
