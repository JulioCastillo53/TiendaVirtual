import java.util.List;

public class CarritoDeCompras {
    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private float total;

    public CarritoDeCompras(int id, Usuario usuario, List<Producto> productos) {
        setId(id);
        setUsuario(usuario);
        setProductos(productos);
        this.total = 0.0f;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            System.out.println("Producto agregado al carrito");
        } else {
            System.out.println("No se puede agregar un producto nulo al carrito");
        }
    }

    public void eliminarProducto(Producto producto) {
        if (producto != null && productos.contains(producto)) {
            productos.remove(producto);
            System.out.println("Producto eliminado del carrito");
        } else {
            System.out.println("El producto no está en el carrito");
        }
    }

    public void actualizarCantidad() {
        System.out.println("Cantidad de producto actualizada");
    }

    public void calcularTotal() {
        float sumaTotal = 0.0f;
        for (Producto producto : productos) {
            sumaTotal += producto.getPrecio();
        }
        total = sumaTotal;
        System.out.println("Total calculado: " + total);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}

