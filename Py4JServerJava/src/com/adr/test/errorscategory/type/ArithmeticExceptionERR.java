
package com.adr.test.errorscategory.type;


public class ArithmeticExceptionERR {
    
    public void RuntimeErrors()
    {
        int result = 10 / 0;
        // Error: División por cero, lo que causa un ArithmeticException.
    }
    
}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.adr.test.errorscategory.type.ArithmeticExceptionERR.RuntimeErrors(ArithmeticExceptionERR.java:9)
//	at com.adr.app.AppMain.main(AppMain.java:40)
//C:\Users\Conexion\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
