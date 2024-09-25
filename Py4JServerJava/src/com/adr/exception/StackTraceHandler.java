
package com.adr.exception;

import com.adr.model.exceptions.ExceptionHandlingModel;


public class StackTraceHandler {
    
    
    public void setStackTrace(ExceptionHandlingModel ExecpMod, Exception e)
    {
        StringBuilder StkBuild = new StringBuilder();
        for ( StackTraceElement stkElem : e.getStackTrace()  )
        {
            StkBuild.append(stkElem.toString()).append("\n");
        }
        
        ExecpMod.setGroupStackTrace(StkBuild.toString());
        System.out.println("Stack Trace: \n" + ExecpMod.getGroupStackTrace());
    }
    
}
