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
import com.adr.model.ErrorModel;
import com.adr.service.ErrorService;
import com.adr.test.JavaPy4JServer;
import com.adr.test.errorscategory.LogCategoryService;
import com.adr.test.errorscategory.type.ArithmeticExceptionERR;
import com.adr.test.errorscategory.type.ArrayIndexOutOfBoundsExceptionERR;
import com.adr.test.errorscategory.type.ClassCastExceptionERR;
import com.adr.test.errorscategory.type.IncorrectCalculationsERR;
import com.adr.test.errorscategory.type.MissingReturnStatementERR;
import com.adr.test.errorscategory.type.SyntaxErrorERR;
import com.adr.test.errorscategory.type.TypeMismatchERR;
import com.adr.test.errorscategory.type.NullPointerExceptionERR;
import com.adr.test.errorscategory.type.NumberFormatExceptionERR;
import com.adr.test.log.ListLogginTemp;
import com.adr.view.ErrorGUI;
import py4j.GatewayServer;

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

//        4. Excepciones No Verificadas (Unchecked Exceptions)

//          ClassCastExceptionERR classCastExceptionERR  = new ClassCastExceptionERR();
//          classCastExceptionERR.UncheckedExceptions();

//            NumberFormatExceptionERR numberFormatExceptionERR = new NumberFormatExceptionERR();
//            numberFormatExceptionERR.UncheckedExceptions();
//          

        /**
         * ****************************************************
         */
//        ErrorModel errorModel = new ErrorModel();
//        ErrorService errorService = new ErrorService(errorModel);
//        errorService.testMethod();
//        
//        ErrorGUI errorGUI = new ErrorGUI();
//        errorGUI.setVisible(true);
//        errorGUI.setLocationRelativeTo(null);             
        /* TEST DE CONEXIÓN */
//        //System.out.println("TEST RUN.");
//        // Crear una instancia del servidor Py4JServer
//        JavaPy4JServer appserver = new JavaPy4JServer();
//
//        // Iniciar el servidor Py4J con el objeto app
//        GatewayServer server = new GatewayServer(appserver);
//        server.start();
//
//        // Mensaje para confirmar que el servidor Py4J ha sido iniciado
//        System.out.println("Py4J Server Started.");

          ListLogginTemp listLogginTemp = new ListLogginTemp();
          listLogginTemp.listTemp();
            
    }

}
