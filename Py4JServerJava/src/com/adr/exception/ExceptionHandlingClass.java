package com.adr.exception;

public class ExceptionHandlingClass {

    public void exceptionTesting() {

        try {
            int data = 50 / 0;
            System.out.println("Resto del código...");
        } catch (Exception e) {
            Exception E = e;
            Exception Ee = E;
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

}
