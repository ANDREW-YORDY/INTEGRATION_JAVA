
package com.adr.test.errorscategory.type;


public class ClassCastExceptionERR {
    
    public void UncheckedExceptions()
    {
        Object obj = "Texto";
        Integer num = (Integer) obj;
        // Error: Intento de hacer casting de un String a Integer.
    }
    
}


//Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
//	at com.adr.test.errorscategory.type.ClassCastExceptionERR.UncheckedExceptions(ClassCastExceptionERR.java:10)
//	at com.adr.app.AppMain.main(AppMain.java:50)
//C:\Users\Conexion\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)