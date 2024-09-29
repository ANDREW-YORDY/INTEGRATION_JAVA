package com.adr.model.exceptions;

public class ExceptionHandlingModel {

    private String exceptionType;
    private String exceptionMessage;
    private String localizedMessage;
    private String cause;
    private String suppressed;
    private String groupStackTrace;

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public String getCausex() {
        return cause;
    }

    public void setCausex(String cause) {
        this.cause = cause;
    }

    public String getSuppressedx() {
        return suppressed;
    }

    public void setSuppressedx(String suppressed) {
        this.suppressed = suppressed;
    }

    public String getGroupStackTrace() {
        return groupStackTrace;
    }

    public void setGroupStackTrace(String groupStackTrace) {
        this.groupStackTrace = groupStackTrace;
    }

    @Override
    public String toString() {
        return "ExceptionHandlingModel \n{\n"
                + "  exceptionType    =   " + getExceptionType()    + "\n"
                + "  exceptionMessage =   " + getExceptionMessage() + "\n"
                + "  localizedMessage =   " + getLocalizedMessage() + "\n"
                + "  getCause         =   " + getCausex()           + "\n"
                + "  getSuppressed    =   " + getSuppressedx()      + "\n"
                + "  GroupStackTrace  =   " + getGroupStackTrace().toString()  + "\n"
                + "  GroupStackTrace  =   " + getGroupStackTrace()  + "\n"
                + "} \n";
    }

}
