package com.adr.log;

import com.adr.log.ErrorHandlerclass;
import com.adr.log.ErrorLoggerClass;
import com.adr.test.log.ListLogginTemp;

public class ErrorControllerClass {

    public void runErrors() {
        
        ErrorHandlerclass errorHandler = new ErrorHandlerclass();
        ErrorLoggerClass errorLogger = new ErrorLoggerClass();

        try {
            // Inducir un error (NullPointerException)
            induceErrors();
        } catch (Exception e) {
            // Registrar el error
            String errorMessage = "Error: " + e.toString();
            errorLogger.logError(errorMessage);  // Registrar con logger
            errorHandler.addError(errorMessage); // Guardar en lista temporal
        }
        // Mostrar los errores almacenados temporalmente
        errorHandler.showStoredErrors();
    }

    // Método para inducir un error
    private static void induceErrors() throws Exception {

        // ERROR INDUCIDO:
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);

        ListLogginTemp listLogginTemp = new ListLogginTemp();
        listLogginTemp.listTemp();

    }

}
