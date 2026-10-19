package com.edu.ec.negocio;

public class ReservaService {

    public void crearReserva(Reserva reserva) {
        System.out.println("Reserva creada para el cliente: " + reserva.getCliente());
        System.out.println("Habitación: " + reserva.getHabitacion());
        System.out.println("Noches: " + reserva.getNoches());
        System.out.println("Precio por noche: " + reserva.getPrecioPorNoche());
        System.out.println("Total a pagar: " + reserva.calcularTotal());

        // Enviar notificación al cliente
        NotificacionService notificacionService = new NotificacionService();
        String mensaje = "Reserva confirmada";
        String cuerpo = "Estimado " + reserva.getCliente() + ", su reserva para la habitación " + reserva.getHabitacion() + " por " + reserva.getNoches() + " noches ha sido confirmada. Total a pagar: " + reserva.calcularTotal();
        notificacionService.enviar(reserva.getCorreo(), mensaje, cuerpo);  

    }

}
