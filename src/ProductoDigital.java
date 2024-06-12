public class ProductoDigital extends Producto{

    private String formato; // Ejemplo: PDF, MP3, MP4
    private float tamanoArchivo; // Tamaño en MB
    private String urlDescarga;
    private boolean disponibleStreaming;
    protected float comision = 12;

    public ProductoDigital(int id, String nombre, String descripcion, float precio, int stock, float descuento, String formato, float tamanoArchivo, String urlDescarga, boolean disponibleStreaming) {
        super(id, nombre, descripcion, precio, stock, descuento);
        this.formato = formato;
        this.tamanoArchivo = tamanoArchivo;
        this.urlDescarga = urlDescarga;
        this.disponibleStreaming = disponibleStreaming;
    }

    public ProductoDigital(int id) {
        super(id);
        this.formato = "UKN";
        this.tamanoArchivo = 0;
        this.urlDescarga = "/";
        this.disponibleStreaming = false;
    }

    public ProductoDigital(float precio, float descuento) {
        super(precio, descuento);
        this.formato = "UKN";
        this.tamanoArchivo = 2;
        this.urlDescarga = "/";
        this.disponibleStreaming = false;
    }

    public ProductoDigital(int id, String nombre, float precio) {
        super(id, nombre, precio);
        this.formato = "FAC";
        this.tamanoArchivo = 45;
        this.urlDescarga = "/factory-product";
        this.disponibleStreaming = true;
    }

    // Getters y Setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public float getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(float tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    public boolean isDisponibleStreaming() {
        return disponibleStreaming;
    }

    public void setDisponibleStreaming(boolean disponibleStreaming) {
        this.disponibleStreaming = disponibleStreaming;
    }

    // Métodos adicionales específicos para productos digitales
    public boolean esDescargable() {
        return urlDescarga != null && !urlDescarga.isEmpty();
    }

    public boolean esDisponibleParaStreaming() {
        return disponibleStreaming;
    }

    @Override
    public float calcularPrecioFinal() {
        return super.calcularPrecioFinal() + comision;
    }
}
