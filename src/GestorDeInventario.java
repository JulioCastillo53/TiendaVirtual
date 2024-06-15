public abstract class GestorDeInventario {

    protected int cantidad;

    public GestorDeInventario(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract void agregarProducto(String producto, int cantidad);

    public abstract void eliminarProducto(String producto);

    public abstract void actualizarStock(String producto, int nuevaCantidad);
}
