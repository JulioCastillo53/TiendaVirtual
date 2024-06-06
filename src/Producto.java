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

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
