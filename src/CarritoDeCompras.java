import java.util.List;

public class CarritoDeCompras {
    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private float total;

    public CarritoDeCompras(int id, Usuario usuario, List<Producto> productos) {
        this.id = id;
        this.usuario = usuario;
        this.productos = productos;
        this.total = 0.0f;
    }

    public void agregarProducto(Producto producto) {

        System.out.println("Producto agregado al carrito");
    }

    public void eliminarProducto(Producto producto) {

        System.out.println("Producto eliminado del carrito");
    }

    public void actualizarCantidad() {
        System.out.println("Cantidad de producto actualizada");
    }

    public void calcularTotal() {
        System.out.println("Total calculado: " + total);
    }

}
