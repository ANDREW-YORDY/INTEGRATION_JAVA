package com.adr.app;

import com.adr.log.file.ErrorControllerFile;

public class AppMain {
    public static void main(String[] args) {
        String logDirectory = System.getProperty("user.home") + "/logs/myapp";
        
        ErrorControllerFile ctrErrorF = new ErrorControllerFile(logDirectory);
        ctrErrorF.runErrors();
    }
}