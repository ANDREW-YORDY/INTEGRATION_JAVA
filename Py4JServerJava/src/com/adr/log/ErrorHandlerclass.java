
package com.adr.log;

import java.util.ArrayList;
import java.util.List;


//Clase ErrorHandler (responsable de manejar los errores)

public class ErrorHandlerclass {
    
    // Listta temporal para manejar errores.
    private final List<String> errorList = new ArrayList<>();
    
    // Método para agregar errores a la lista temporal.
    public void addError(String errorMessage)
    {
        errorList.add(errorMessage);
    };
    
    // Método para mostrar los errores almacenados temporalmente.
    public void showStoredErrors() {
        System.out.println("Errores almacenados temporalmente:");
        errorList.forEach(System.out::println);
    }
    
    public List<String> getErrorList()
    {
        return errorList;
    }
    
}
