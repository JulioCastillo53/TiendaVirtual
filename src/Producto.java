public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private float descuento;

    public Producto(int id, String nombre, String descripcion, float precio, int stock, float descuento) {
        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setStock(stock);
        setDescuento(descuento);
    }

    public Producto(float precio, float descuento) {
        setId(100);
        setNombre("Temporal");
        setDescripcion("Producto temporal");
        setPrecio(precio);
        setStock(1);
        setDescuento(descuento);
    }

    public Producto(int id) {
        setId(id);
        setNombre("Temporal solo ID");
        setDescripcion("Producto temporal");
        setPrecio(10.10f);
        setStock(1);
        setDescuento(0);
    }

    public Producto(int id, String nombre, float precio) {
        setId(id);
        setNombre(nombre);
        setDescripcion("Producto sin descripción temporal");
        setPrecio(precio);
        setStock(1);
        setDescuento(0);
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        if (descuento < 0) {
            throw new IllegalArgumentException("El descuento no puede ser negativo.");
        }
        this.descuento = descuento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que cero.");
        }
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