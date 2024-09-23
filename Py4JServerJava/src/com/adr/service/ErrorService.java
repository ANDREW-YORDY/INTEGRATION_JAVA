package com.adr.service;

import com.adr.model.ErrorModel;
import java.util.Random;


public class ErrorService {
    
    
    private final ErrorModel errorModel;    
    
    public ErrorService(ErrorModel errorModel)
    {
        this.errorModel = errorModel;
    }
    
    
   public void induceDivisionByZeroError()
   {
       try {
           int result = 1 / 0;        //Simulación de error: División por cero.
       } catch (ArithmeticException e)
       {
           errorModel.addError(" Simulated Error: División by zero. ");
       }
   }
   
   
   public void induceRandomError()
   {
       Random random = new Random();
       int errorType = random.nextInt(4);
       
       switch (errorType)
       {
           case 0:
               induceDivisionByZeroError();
               break;
       }
       
   }
   
   public String getErrors()
   {
       return String.join("\n", errorModel.getErrors());
   }

   
   
   public void testMethod()
   {
       System.out.println("TESTING.");
   }
   
    
}
