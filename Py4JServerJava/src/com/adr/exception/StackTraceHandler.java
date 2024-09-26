package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;

public class StackTraceHandler {

    public void setStackTrace(ExceptionHandlingModel excepMod, Exception e) {
        System.out.println("STACK TRACE* ");
        StringBuilder stackTraceBuilder = new StringBuilder();
        for (StackTraceElement elem : e.getStackTrace()) {
            stackTraceBuilder.append(elem.toString());
        }
        excepMod.setGroupStackTrace(stackTraceBuilder.toString());
        System.out.println("LISTA STACK-TRACE: " + excepMod.toString());

    }

}


/* Ésta clase, depende directamente de la clase hermana ExceptionDetailsHandler(){}, -
** ya que, ExceptionDetailsHandler, es la encargada, se asignar o establecer los valores -
** de los métodos setters, de cada propiedad establecida de la excepción.
** Se podría implementar SPR, para este caso, pero por el momento, así debe permanecer.
*/
