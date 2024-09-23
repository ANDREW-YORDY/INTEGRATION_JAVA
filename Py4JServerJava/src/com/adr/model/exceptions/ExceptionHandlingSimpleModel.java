package com.adr.model.exceptions;

public class ExceptionHandlingSimpleModel {

    //contructor, getters, setters.
    private String e ;
    private String exceptionType ;
    private String exceptionMessage ;
    private String getCause ;
    private String getSuppressed ;

    
    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
    
    public String getExceptionType()
    {
        return exceptionType;
    }
    public void setExceptionType(String exceptionType)
    {
        this.exceptionType = exceptionType;
    }

    public String getGetCause() {
        return getCause;
    }
    public void setGetCause(String getCause) {
        this.getCause = getCause;
    }

    public String getGetSuppressed() {
        return getSuppressed;
    }
    public void setGetSuppressed(String getSuppressed) {
        this.getSuppressed = getSuppressed;
    }

    @Override
    public String toString() {
        System.out.println(getGetCause());
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
