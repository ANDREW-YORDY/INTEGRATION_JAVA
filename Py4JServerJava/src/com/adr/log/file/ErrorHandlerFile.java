package com.adr.log.file;

import com.adr.model.exceptions.ExceptionHandlingModel;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandlerFile {

    private final List<Exception> errorList = new ArrayList<>();  // Lista de excepciones.
    private final ErrorLoggerFile errorLoggerFile;

    // Constructor que inicializa el logger.
    public ErrorHandlerFile(String logDirectory) {
        errorLoggerFile = new ErrorLoggerFile(logDirectory);
    }

    private ExceptionHandlingModel convertExceptionToModel(Exception e) {
        ExceptionHandlingModel excepModel = new ExceptionHandlingModel();

        // Tipo de excepción
        excepModel.setExceptionType(e.getClass().getSimpleName());

        // Mensajes
        excepModel.setExceptionMessage(e.getMessage());
        excepModel.setLocalizedMessage(e.getLocalizedMessage());

        // Causa
        Throwable cause = e.getCause();
        excepModel.setCausex(cause != null ? cause.toString() : "No cause");

        // Excepciones suprimidas
        Throwable[] suppressed = e.getSuppressed();
        if (suppressed.length > 0) {
            // Solo se toma el primer mensaje de la excepción suprimida
            String suppressedMessage = suppressed[0].toString(); // O el método que uses para obtener el mensaje
            excepModel.setSuppressedx(suppressedMessage);
        } else {
            excepModel.setSuppressedx("No suppressed exceptions"); // Mensaje predeterminado si no hay excepciones suprimidas
        }

        // StackTrace como cadena
        StringBuilder stackTrace = new StringBuilder();
        for (StackTraceElement element : e.getStackTrace()) {
            stackTrace.append(element.toString()).append("\n");
        }
        excepModel.setGroupStackTrace(stackTrace.toString());

        return excepModel;
    }

    // Método que agrega una excepción a la lista de errores y la registra en el archivo.
    public void addError(Exception e) {
        errorList.add(e);                         // Almacena la excepción.

        // Convertir la excepción a un modelo
        ExceptionHandlingModel excepModel = convertExceptionToModel(e);

        // Formato del mensaje a registrar en el archivo
    String errorMessage = String.format("exceptionType    =   %s\n" +
                                         "exceptionMessage =   %s\n" +
                                         "localizedMessage =   %s\n" +
                                         "getCause         =   %s\n" +
                                         "getSuppressed    =   %s\n" +
                                         "GroupStackTrace  =   %s\n",
            excepModel.getExceptionType(),
            excepModel.getExceptionMessage(),
            excepModel.getLocalizedMessage(),
            excepModel.getCausex(),
            excepModel.getSuppressedx(),
            excepModel.getGroupStackTrace() == null ? "null" : excepModel.getGroupStackTrace());


        errorLoggerFile.logError(errorMessage); // Registra el mensaje en el archivo.  // Registra el mensaje en el archivo.
    }

    // IMPRIME EL STACK TRACE COMPLETO - Este enfoque muestra más detalles.
    public void showStoredErrors() {
        System.out.println("Errores Almacenados temporalmente:");
        errorList.forEach(e -> {
            e.printStackTrace();
        });  // Imprime el mensaje de cada excepción.
    }

//    public void showStoredErrors() 
//    {
//        System.out.println("Errores Almacenados temporalmente:");
//        errorList.forEach(e -> System.out.println(e.getMessage()));  // Imprime el mensaje de cada excepción
//    }
    public List<Exception> getErrorList() {
        return errorList;
    }

    public void closeErrorHandler() {
        errorLoggerFile.closeLogger();
    }
}
