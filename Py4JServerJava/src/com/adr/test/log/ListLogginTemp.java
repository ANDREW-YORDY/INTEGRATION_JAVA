package com.adr.test.log;

import java.util.ArrayList;
import java.util.List;

public class ListLogginTemp {

    //Lista temporal para guardar los errores.
    private static final List<String> errorList = new ArrayList<>();

    public void listTemp() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (Exception e) {
            //Guardando el error en la lista temporal.
            logError(e);
        }

        System.out.println("Errores Capturados: ");
        for (String error : errorList) {
            System.out.println(error);
        }

        //Limpiamos la lista si ya no es necesaria.
        errorList.clear();
    }

    // Método para guardar el error en la lista
    public static void logError(Exception e) {
        errorList.add("Error: " + e.toString());
    }

}
