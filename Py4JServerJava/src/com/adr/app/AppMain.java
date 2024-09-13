package com.adr.app;

import com.adr.model.ErrorModel;
import com.adr.service.ErrorService;
import com.adr.test.JavaPy4JServer;
import com.adr.view.ErrorGUI;
import py4j.GatewayServer;

public class AppMain {

    public static void main(String[] args) {
        
        
        ErrorModel errorModel = new ErrorModel();
        ErrorService errorService = new ErrorService(errorModel);
        ErrorGUI errorGUI = new ErrorGUI();
        errorGUI.setVisible(true);
        errorGUI.setLocationRelativeTo(null);
        
        
        
/* TEST DE CONEXIÓN */
//        //System.out.println("TEST RUN.");
//        // Crear una instancia del servidor Py4JServer
//        JavaPy4JServer appserver = new JavaPy4JServer();
//
//        // Iniciar el servidor Py4J con el objeto app
//        GatewayServer server = new GatewayServer(appserver);
//        server.start();
//
//        // Mensaje para confirmar que el servidor Py4J ha sido iniciado
//        System.out.println("Py4J Server Started.");
        
    }

}
