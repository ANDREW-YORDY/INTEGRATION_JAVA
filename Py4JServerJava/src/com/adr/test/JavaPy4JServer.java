package com.adr.test;

public class JavaPy4JServer {

    public String induceError(int errorCode) 
    {
        switch (errorCode) {
            case 1:
                throw new NullPointerException("(Simulated NullPointerException)");
            case 2:
                throw new ArrayIndexOutOfBoundsException("(Simulated ArrayIndexOutOfBoundsException)");
            default:
                return "No Error";
        }

    }

    //TEST CONNECTION:
    public String messageTest() {
        return "Connection From JAVA.";
    }

}
