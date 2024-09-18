
package com.adr.test.errorscategory.type;


public class NumberFormatExceptionERR {
    
    public void UncheckedExceptions()
    {
        String number = "abc";
        int result = Integer.parseInt(number);
         // Error: Intento de convertir una cadena no numérica en un entero.
    }
    
}



//Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
//	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//	at java.lang.Integer.parseInt(Integer.java:580)
//	at java.lang.Integer.parseInt(Integer.java:615)
//	at com.adr.test.errorscategory.type.NumberFormatExceptionERR.UncheckedExceptions(NumberFormatExceptionERR.java:10)
//	at com.adr.app.AppMain.main(AppMain.java:54)
//C:\Users\Conexion\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1



