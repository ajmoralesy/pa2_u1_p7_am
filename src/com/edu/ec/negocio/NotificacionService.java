package com.edu.ec.negocio;

public class NotificacionService {

    public void enviar(String correo, String mensaje,
        String cuerpo) {
        System.out.println("Enviando notificación a: " + correo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("Notificación enviada con éxito.");
    }

}
