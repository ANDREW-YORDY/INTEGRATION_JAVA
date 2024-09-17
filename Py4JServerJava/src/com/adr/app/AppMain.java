package com.adr.app;

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
import com.adr.view.ErrorGUI;
import py4j.GatewayServer;

public class AppMain {

    public static void main(String[] args) {
        //1. Errores de Compilación (Compilation Errors):

        //        MissingReturnStatementERR missingReturnStatement = new MissingReturnStatementERR();
        //        missingReturnStatement.compilatError_getNumber();
        //        TypeMismatchERR typeMismatch = new TypeMismatchERR();
        //        typeMismatch.compilationError();
        //        SyntaxErrorERR sintaxError = new SyntaxErrorERR();
        //        sintaxError.compilationError();
        
        
        //2. Errores de Ejecución(Runtime Errors):
        
//        NullPointerExceptionERR nullPointerException = new NullPointerExceptionERR();
//        nullPointerException.RuntimeErrors();
//        ArrayIndexOutOfBoundsExceptionERR arrayIndexOutOfBoundsExceptionERR = new ArrayIndexOutOfBoundsExceptionERR();
//        arrayIndexOutOfBoundsExceptionERR.RuntimeErrors();
//        ArithmeticExceptionERR arithmeticException = new ArithmeticExceptionERR();
//        arithmeticException.RuntimeErrors();


//        3. Errores de Lógica (Logic Errors):

//           IncorrectCalculationsERR incorrectCalculationsERR = new IncorrectCalculationsERR(); 
//           incorrectCalculationsERR.LogicError2();


//        4. Excepciones No Verificadas (Unchecked Exceptions)

//          ClassCastExceptionERR classCastExceptionERR  = new ClassCastExceptionERR();
//          classCastExceptionERR.UncheckedExceptions();

            NumberFormatExceptionERR numberFormatExceptionERR = new NumberFormatExceptionERR();
            numberFormatExceptionERR.UncheckedExceptions();
          

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
    }

}
