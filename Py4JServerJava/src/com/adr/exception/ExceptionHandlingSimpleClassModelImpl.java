package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingSimpleModel;

public class ExceptionHandlingSimpleClassModelImpl {   
    

    ExceptionHandlingSimpleModel ctrx = new ExceptionHandlingSimpleModel();

    public void exceptionSimpleGetModls() {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            ctrx.setExceptionType(e.getMessage());
            System.out.println("c: " + ctrx.getExceptionType());
        }
    }
    
    

}
