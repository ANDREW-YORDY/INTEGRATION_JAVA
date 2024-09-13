package com.adr.model;

import java.util.ArrayList;
import java.util.List;



public class ErrorModel {
    
    private final List<String> errorLog;
    
    
    public ErrorModel()
    {
        this.errorLog = new ArrayList<>();
    }
    
    
    public void addError(String error)
    {
        errorLog.add(error);
    }
    
    public List<String> getErrors()
    {
        return new ArrayList<>(errorLog);
    }
    
    
}
