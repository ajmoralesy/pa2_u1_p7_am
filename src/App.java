
import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        //Creamos manualmente el objeto de la clase Pedido
        Pedido pedido = new Pedido("Juan Perez", "Laptop", 1500.00, "juan.perez@example.com");
 
        PedidoService pedidoService = new PedidoService();
        pedidoService.realizar(pedido);
 
        pedido = null; //Hace que el objeto sea elegido por el GC (Garbage Collector)
        pedidoService = null; //Hace que el objeto sea elegido por el GC
 
 
    }
}