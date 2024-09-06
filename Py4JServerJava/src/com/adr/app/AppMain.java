
package com.adr.app;

import com.adr.service.JavaPy4JServer;
import py4j.GatewayServer;


public class AppMain {


    public static void main(String[] args) {
        
        //System.out.println("TEST RUN.");
        
        // Crear una instancia del servidor Py4JServer
        JavaPy4JServer appserver = new JavaPy4JServer();
        
        // Iniciar el servidor Py4J con el objeto app
        GatewayServer  server    = new GatewayServer(appserver);
        server.start();
        
        // Mensaje para confirmar que el servidor Py4J ha sido iniciado
        System.out.println("Py4J Server Started.");
        
    }
    
}
