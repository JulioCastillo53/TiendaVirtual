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

    public Producto(float precio, float descuento){
        this.id = 100;
        this.nombre = "Temporal";
        this.descripcion = "Producto temporal";
        this.precio = precio;
        this.stock = 1;
        this.descuento = descuento;
    }

    public Producto(int id){
        this.id = id;
        this.nombre = "Temporal solo ID";
        this.descripcion = "Producto temporal";
        this.precio = 10.10f;
        this.stock = 1;
        this.descuento = 0;
    }

    public Producto(int id, String nombre, float precio){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = "Producto sin descripción temporal";
        this.precio = precio;
        this.stock = 1;
        this.descuento = 0;
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

    public float calcularPrecioFinal() {
        return precio - descuento;
    }
}
