package com.adr.exception;

public class ExceptionHandlingClass {

    // PROBAR, USABILIDAD DE LOS MÉTODOS DE UNA EXCEPTION:
    public void exceptionTesting() {
        try {
            int data = 50 / 0;
            System.out.println("Resto del código...");
        } catch (Exception e) {
            Exception E = e;
            System.out.println("?error1: " + e.getLocalizedMessage());
            System.out.println("?error2: " + e.getMessage());       //usar
            System.out.println("?error3: " + e.getCause());         //usar
            System.out.println("?error4: " + e.getClass());         //usar
            System.out.println("?error5: " + e.getStackTrace());
            System.out.println("?error6: " + e.getSuppressed());
            System.out.println("***********************************");
            System.out.println("?error7: " + e.toString());         //usar
            System.out.println("?error8: " + e.equals(E));
            System.out.println("?error9: " + e.fillInStackTrace());
            System.out.println("?error10: " + e.hashCode());
//          System.out.println("?error11: " + e.initCause(e) );// Muestra la descripción completa.
        } finally {
            System.out.println("Bloque finally.");
        }

    }

    // OBTENER DETALLES PRECISOS INDIVIDUALES, DE UNA EXCEPTION:
    public void exceptionDetailTest() {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            // Obtener el nombre completo de la clase de la excepción
            String exceptionType = e.getClass().getName();

            // Obtener el mensaje de la excepción
            String exceptionMessage = e.getMessage();

            // Obtener el stack trace como un string
            StringBuilder stackTraceBuilder = new StringBuilder();
            for (StackTraceElement element : e.getStackTrace()) {
                stackTraceBuilder.append(element.toString()).append("\n");
            }
            String stackTrace = stackTraceBuilder.toString();

            // Imprimir la información por separado
            System.out.println("Exception Type: " + exceptionType);
            System.out.println("Exception Message: " + exceptionMessage);
            System.out.println("Stack Trace: " + stackTrace);

            // Aquí puedes guardar los detalles en variables o hacer lo que necesites con ellos
        }
    }

    public void exceptionDetailTestingTT() {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            // Obtener detalles separados de la excepción
            String exceptionType = e.getClass().getName();
            String exceptionMessage = e.getMessage();
            Throwable cause = e.getCause();
            StackTraceElement[] stackTrace = e.getStackTrace();
            Throwable[] suppressed = e.getSuppressed();

            // Imprimir los detalles
            System.out.println("*Exception Type: " + exceptionType);
            System.out.println("*Exception Message: " + exceptionMessage);
            System.out.println("*Cause: " + (cause != null ? cause.getMessage() : "No cause"));
            System.out.println("*Stack Trace:");
            for (StackTraceElement element : stackTrace) {
                System.out.println("STK== "+element);
            }

            if (suppressed.length > 0) {
                System.out.println("Suppressed Exceptions:");
                for (Throwable t : suppressed) {
                    System.out.println(t.getMessage());
                }
            }
        }
    }

}

//    public void exceptionDetailTesting() 
//    {
//        try {
//            int data = 50 / 0;
//        } catch (Exception e) {
//            System.out.println("?error2: " + e.getMessage());
//
//        }
//    }
//    // OBTENER DETALLES PRECISOS INDIVIDUALES, DE UNA EXCEPTION:
//    public void exceptionDetailTest() {
//        try {
//            int data = 50 / 0;
//        } catch (Exception e) {
//
//            StackTraceElement[] stackTrace = e.getStackTrace();
//            for (StackTraceElement element : stackTrace) {
//                System.out.println("Método: " + element.getMethodName() + ", Línea: " + element.getLineNumber());
//            }
//
//            // Aquí puedes guardar los detalles en variables o hacer lo que necesites con ellos
//        }
//    }
