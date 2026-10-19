import com.edu.ec.negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de Reserva
        Reserva reserva = new Reserva("Alexis Morales", "Habitación Deluxe", 2, 65.0, "ajmoralesy@uce.edu.ec");
        ReservaService reservaService = new ReservaService();
        reservaService.crearReserva(reserva);
    }
}
