package com.adr.service;

import com.adr.model.ErrorModel;


public class ErrorService {
    
    private ErrorModel errorModel;
    
    
    public ErrorService(ErrorModel errorModel)
    {
        this.errorModel = errorModel;
    }
    
    
   public void induceDivisionByZeroError()
   {
       try {
           int result = 1 / 0;                      //Simulación de error: División por cero.
       } catch (ArithmeticException e)
       {
           errorModel.addError(" Simulated Error: División by zero. ");
       }
   }
   
   
   
    
    
}
