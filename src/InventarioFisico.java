public class InventarioFisico extends GestorDeInventario {

    public InventarioFisico(int cantidad) {
        super(cantidad);
    }

    @Override
    public void agregarProducto(String producto, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }
        System.out.println("Añadiendo " + cantidad + " unidades de " + producto + " al inventario físico.");
    }

    @Override
    public void eliminarProducto(String producto) {
        if (producto == null || producto.isEmpty()) {
            throw new IllegalArgumentException("El producto no puede ser nulo o vacío.");
        }
        System.out.println("Eliminando " + producto + " del inventario físico.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        if (nuevaCantidad < 0) {
            throw new IllegalArgumentException("La nueva cantidad no puede ser negativa.");
        }
        if (producto == null || producto.isEmpty()) {
            throw new IllegalArgumentException("El producto no puede ser nulo o vacío.");
        }
        System.out.println("Actualizando stock de " + producto + " a " + nuevaCantidad + " unidades en el inventario físico.");
    }
}
