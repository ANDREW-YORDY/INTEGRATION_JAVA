package com.adr.log.file;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandlerFile {
    private List<String> errorList = new ArrayList<>();
    private ErrorLoggerFile errorLoggerFile;

    public ErrorHandlerFile(String logDirectory) {
        errorLoggerFile = new ErrorLoggerFile(logDirectory);
    }

    public void addError(String errorMessage) {
        errorList.add(errorMessage);
        errorLoggerFile.logError(errorMessage);
    }

    public void addError(Exception e) {
        String errorMessage = String.format("%s: %s", e.getClass().getSimpleName(), e.getMessage());
        addError(errorMessage);
    }

    public void showStoredErrors() {
        System.out.println("Errores Almacenados temporalmente:");
        errorList.forEach(System.out::println);
    }

    public List<String> getErrorList() {
        return errorList;
    }

    public void closeErrorHandler() {
        errorLoggerFile.closeLogger();
    }
}