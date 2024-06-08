import javax.swing.*;

public class ProductoFisico extends Producto{

    private float peso; // Peso del producto en kg
    private String dimensiones; // Dimensiones del producto (largo x ancho x alto)
    private String material; // Material del producto
    private String codigoBarras; // Código de barras del producto

    public ProductoFisico(int id, String nombre, String descripcion, float precio, int stock, float descuento, float peso, String dimensiones, String material, String codigoBarras) {
        super(id, nombre, descripcion, precio, stock, descuento);
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.material = material;
        this.codigoBarras = codigoBarras;
    }

    public ProductoFisico(int id) {
        super(id);
        this.peso = 0;
        this.dimensiones = "10x10x10";
        this.material = "metal";
        this.codigoBarras = "yuetry-unknown";
    }

    public ProductoFisico(float precio, float descuento) {
        super(precio, descuento);
        this.peso = 0;
        this.dimensiones = "80x80x80";
        this.material = "metal";
        this.codigoBarras = "yuetry-unknown";
    }


    // Getters y Setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    // Métodos adicionales específicos para productos físicos
    public boolean esPesado() {
        return peso > 10.0; // Por ejemplo, si pesa más de 10 kg, se considera pesado
    }

    public boolean tieneCodigoBarrasValido() {
        return codigoBarras != null && !codigoBarras.isEmpty();
    }

    @Override
    public float calcularPrecioFinal() {
        float sobrecostoxDimensiones = 0;
        float sobrecostoxPeso = 1;
        String[] partes = dimensiones.split("x");
        int dimension1 = Integer.parseInt(partes[0]);
        int dimension2 = Integer.parseInt(partes[1]);
        int dimension3 = Integer.parseInt(partes[2]);
        if(dimension1 + dimension2 + dimension3 > 200)
        {
            sobrecostoxDimensiones = 50;
        }
        if(peso>10 && peso<20){
            sobrecostoxPeso = 15;
        }else if (peso>50){
            sobrecostoxPeso = peso/10 * 15;
        }
        return super.calcularPrecioFinal() + sobrecostoxDimensiones + sobrecostoxPeso;
    }
}
