
package com.adr.model.file;

import java.util.ArrayList;
import java.util.List;

public class ErrorModel {
    private List<String> errorList;

    public ErrorModel() {
        this.errorList = new ArrayList<>();
    }

    // Agrega un error a la lista
    public void addError(String error) {
        errorList.add(error);
    }

    // Devuelve la lista de errores
    public List<String> getErrors() {
        return errorList;
    }
}

