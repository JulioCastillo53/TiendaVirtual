import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private String estado;
    private Date fecha;
    private float total;

    public Pedido(int id, Usuario usuario, List<Producto> productos, String estado, Date fecha, float total) {
        this.id = id;
        this.usuario = usuario;
        this.productos = productos;
        this.estado = estado;
        this.fecha = fecha;
        this.total = total;
    }

    public void crearPedido() {
        System.out.println("Pedido creado");
    }

    public void actualizarEstado() {
        System.out.println("Estado del pedido actualizado");
    }

    public void visualizarHistorial() {
        System.out.println("Historial de pedidos visualizado");
    }
}
