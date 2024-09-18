package com.adr.app;

import com.adr.log.ErrorHandlerclass;
import com.adr.log.ErrorLoggerClass;
//import com.adr.model.ErrorModel;
//import com.adr.service.ErrorService;
//import com.adr.test.JavaPy4JServer;
//import com.adr.test.errorscategory.LogCategoryService;
//import com.adr.test.errorscategory.type.ArithmeticExceptionERR;
//import com.adr.test.errorscategory.type.ArrayIndexOutOfBoundsExceptionERR;
//import com.adr.test.errorscategory.type.ClassCastExceptionERR;
//import com.adr.test.errorscategory.type.IncorrectCalculationsERR;
//import com.adr.test.errorscategory.type.MissingReturnStatementERR;
//import com.adr.test.errorscategory.type.SyntaxErrorERR;
//import com.adr.test.errorscategory.type.TypeMismatchERR;
//import com.adr.test.errorscategory.type.NullPointerExceptionERR;
//import com.adr.test.errorscategory.type.NumberFormatExceptionERR;
//import com.adr.view.ErrorGUI;
//import java.util.logging.MemoryHandler;
//import py4j.GatewayServer;

public class AppMain {

    public static void main(String[] args) {

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
        String str = null;
        str.length();  // Genera NullPointerException
    }

}
