package com.adr.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import com.adr.model.exceptions.ExceptionHandlingSimpleModel;
import java.util.Set;

public class ExceptionHandlingSimpleClass 
{

    public void exceptionSimple() {

        try {

            int data = 50 / 0;

        } catch (Exception e) {
            System.out.println("\n___(e) Simple get Methods:___\n");
            Exception _e = e;
            String exceptionType = e.getClass().getName();
            String exceptionMessage = e.getMessage();
            String getLocalizedMessage = e.getLocalizedMessage();
            Throwable getCause = e.getCause();
//            StackTraceElement[] getStackTrace  = e.getStackTrace();
            Throwable[] getSuppressed = e.getSuppressed();

            System.out.println("e:                 " + _e);
            System.out.println("exceptionType   :    " + exceptionType);
            System.out.println("exceptionMessage:    " + exceptionMessage);
            System.out.println("getLocalizedMessage: " + getLocalizedMessage);
            System.out.println("getCause:            " + getCause);
//            System.out.println("getStackTrace:       " + getStackTrace);
            System.out.println("getSuppressed:       " + getSuppressed);

            System.out.println("\n___Stack Trace/String Builder:___"); //**************

            StringBuilder stackTraceBuilder = new StringBuilder();
            for (StackTraceElement elem : e.getStackTrace()) {
                System.out.println("\nelem:        " + elem);
                stackTraceBuilder.append(elem.toString()).append("\n");
                System.out.println("getClassName:  " + elem.getClassName());
                System.out.println("getClass:      " + elem.getClass());
                System.out.println("getClassName:  " + elem.getClass().getSimpleName());
                System.out.println("getFileName:   " + elem.getFileName());
                System.out.println("getMethodName: " + elem.getMethodName());
                System.out.println("getLineNumber: " + elem.getLineNumber());
            }

            System.out.println("\n---END--->"); //**************

        }

    }

}
