package com.adr.log.file;

public class ErrorControllerFile {

    private ErrorHandlerFile errorHandler;

    public ErrorControllerFile(String logDirectory) {
        this.errorHandler = new ErrorHandlerFile(logDirectory);
    }

    public void runErrors() {
        try {
            induceErrors();
        } catch (Exception e) {
            errorHandler.addError(e);
        } finally {
            errorHandler.showStoredErrors();
            errorHandler.closeErrorHandler();
        }
    }

    private void induceErrors() throws Exception {
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[3]);  // Esto lanzará ArrayIndexOutOfBoundsException
//        String text = null;
//        System.out.println("ERROR RUTITIME ERRORS: " +text.length());
        Object obj = "Texto";
        Integer num = (Integer) obj;
    }
}
