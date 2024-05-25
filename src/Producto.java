public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private float descuento;

    public Producto(int id, String nombre, String descripcion, float precio, int stock, float descuento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.descuento = descuento;
    }

    public void agregarProducto() {
        System.out.println("Producto agregado");
    }

    public void editarProducto() {
        System.out.println("Producto editado");
    }

    public void eliminarProducto() {
        System.out.println("Producto eliminado");
    }

    public void actualizarStock() {
        System.out.println("Stock actualizado");
    }

    public void aplicarDescuento() {
        System.out.println("Descuento aplicado");
    }
}
