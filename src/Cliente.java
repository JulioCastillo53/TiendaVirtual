public class Cliente extends Usuario{

    private String numeroTelefono;
    private String metodoPagoPreferido;

    public Cliente(int id, String nombre, String correoElectronico, String contrasena, String direccion, String metodoPagoPreferido, String numeroTelefono) {
        super(id, nombre, correoElectronico, contrasena, direccion);
        this.metodoPagoPreferido = metodoPagoPreferido;
        this.numeroTelefono = numeroTelefono;
    }

    // Getters y Setters
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getMetodoPagoPreferido() {
        return metodoPagoPreferido;
    }

    public void setMetodoPagoPreferido(String metodoPagoPreferido) {
        this.metodoPagoPreferido = metodoPagoPreferido;
    }

    // Métodos adicionales específicos para clientes
    public void actualizarMetodoPago(String nuevoMetodoPago) {
        setMetodoPagoPreferido(nuevoMetodoPago);
    }

    public boolean validarNumeroTelefono() {
        return numeroTelefono != null && numeroTelefono.matches("\\d{10}");
    }
}
