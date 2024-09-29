package com.adr.log.file;


public class ErrorControllerFile 
{

    private ErrorHandlerFile errorHandler;

    // Constructor que inicializa el manejador de errores con un directorio de logs
    public ErrorControllerFile(String logDirectory) 
    {
        this.errorHandler = new ErrorHandlerFile(logDirectory);
    }

    // Método principal que induce errores y gestiona los errores mediante el manejador.
    public void runErrors() 
    {
        try {
            induceErrors();                    // Inducir errores intencionales para prueba.
        } catch (Exception e) {
            errorHandler.addError(e);          // Capturar cualquier excepción y enviarla al manejador
        } finally {
            errorHandler.showStoredErrors();   // Mostrar los errores almacenados.
            errorHandler.closeErrorHandler();  // Cerrar el logger.
        }
    }

    // Método que induce errores para probar el manejo de excepciones.
    private void induceErrors() throws Exception 
    {
        // Errores intencionales para propagar excepciones
        Object obj = "Texto";
        Integer num = (Integer) obj;           // Esto lanzará una ClassCastException.
    }

}
