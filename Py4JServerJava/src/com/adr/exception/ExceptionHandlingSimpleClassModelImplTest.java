package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;

public class ExceptionHandlingSimpleClassModelImplTest 
{

    ExceptionHandlingModel ctrx = new ExceptionHandlingModel();

    public void exceptionSimpleGetModels() {
        try {
            int data = 50 / 0;
        } catch (Exception e) 
        {
            //setters.
            ctrx.setExceptionType(e.getClass().getName());
            ctrx.setExceptionMessage(e.getMessage());
            ctrx.setCausex(e.getLocalizedMessage());
            ctrx.setSuppressedx(e.getSuppressed().toString());
            //getters.
            System.out.println("e:                " + e);
            System.out.println("getExceptionType: " + ctrx.getExceptionType());
            System.out.println("getMessage:       " + ctrx.getExceptionMessage());
            System.out.println("getCause:         " + ctrx.getCausex());
            System.out.println("getGetSuppressed: " + ctrx.getSuppressedx());
            StringBuilder stackTraceBuilder = new StringBuilder();
            for (StackTraceElement elem : e.getStackTrace()) {
                stackTraceBuilder.append(elem.toString()).append("\n");
                System.out.println("getClassName:   " + elem.getClassName());
                System.out.println("getClass:       " + elem.getClass());
                System.out.println("getFileName:    " + elem.getFileName());
                System.out.println("getMethodName:  " + elem.getMethodName());
                System.out.println("getMethodNameX: " + elem.getLineNumber());
            }
        }
    }

}
