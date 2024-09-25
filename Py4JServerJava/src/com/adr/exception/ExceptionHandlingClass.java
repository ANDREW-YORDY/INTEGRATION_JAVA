package com.adr.exception;

public class ExceptionHandlingClass 
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

        }

    }

}
