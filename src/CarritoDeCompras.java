import java.util.List;

public class CarritoDeCompras {
    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private float total;

    public CarritoDeCompras(int id, Usuario usuario, List<Producto> productos) throws ProductoNuloException {
        setId(id);
        setUsuario(usuario);
        setProductos(productos);
        this.total = 0.0f;
    }

    public void agregarProducto(Producto producto) throws ProductoNuloException {
        if (producto != null) {
            productos.add(producto);
            System.out.println("Producto agregado al carrito");
        } else {
            throw new ProductoNuloException();
        }
    }

    public void eliminarProducto(Producto producto) throws ProductoNoEncontradoException, ProductoNuloException {
        if (producto == null) {
            throw new ProductoNuloException();
        }
        if (productos.contains(producto)) {
            productos.remove(producto);
            System.out.println("Producto eliminado del carrito");
        } else {
            throw new ProductoNoEncontradoException();
        }
    }

    public void actualizarCantidad() {
        System.out.println("Cantidad de producto actualizada");
    }

    public void calcularTotal() throws CalculoTotalException {
        try {
            float sumaTotal = 0.0f;
            for (Producto producto : productos) {
                sumaTotal += producto.getPrecio();
            }
            total = sumaTotal;
            System.out.println("Total calculado: " + total);
        } catch (Exception e) {
            throw new CalculoTotalException("Error al calcular el total del carrito");
        }
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

    public void setProductos(List<Producto> productos) throws ProductoNuloException {
        if (productos == null) {
            throw new ProductoNuloException();
        }
        this.productos = productos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
