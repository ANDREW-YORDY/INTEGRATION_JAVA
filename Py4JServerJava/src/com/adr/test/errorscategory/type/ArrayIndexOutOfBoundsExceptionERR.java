
package com.adr.test.errorscategory.type;


public class ArrayIndexOutOfBoundsExceptionERR {
    
    public void RuntimeErrors()
    {
        int[] numbers = {1,2,3};
        System.out.println(numbers[3]);
        // Error: Se intenta acceder a un índice fuera de los límites del array.
    }
    
}


//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//	at com.adr.test.errorscategory.type.ArrayIndexOutOfBoundsExceptionERR.RuntimeErrors(ArrayIndexOutOfBoundsExceptionERR.java:10)
//	at com.adr.app.AppMain.main(AppMain.java:36)
//C:\Users\Conexion\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)


