package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingSimpleModel;

public class ExceptionHandlingSimpleClassModelImpl {
    

    ExceptionHandlingSimpleModel ctrx = new ExceptionHandlingSimpleModel();

    public void exceptionSimpleGetModels() {
        try {
            int data = 50 / 0;
        } catch ( Exception e  ) {
            ctrx.setExceptionType(e.getClass().getName());
            ctrx.setExceptionMessage(e.getMessage());;
            System.out.println("c: " + ctrx.getExceptionType());
            System.out.println("c: " + ctrx.getExceptionMessage());

        }
    }

}
