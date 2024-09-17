
package com.adr.test.errorscategory.type;


public class NullPointerExceptionERR {
    
    
    public void RuntimeErrors()
    {
        String text = null;
        System.out.println("ERROR RUTITIME ERRORS: " +text.length());
        // Error: Se intenta acceder a un método sobre una referencia nula.
    }
    
}

//Exception in thread "main" java.lang.NullPointerExceptionERR
//	at com.adr.test.errorscategory.type.NullPointerExceptionERR.RuntimeErrors(NullPointerExceptionERR.java:11)
//	at com.adr.app.AppMain.main(AppMain.java:32)
//C:\Users\Conexion\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)
