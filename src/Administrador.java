public class Administrador extends Producto{

    private String rol; // Rol del administrador
    private String permisos; // Permisos específicos del administrador

    public Administrador(int id, String nombre, String descripcion, float precio, int stock, float descuento, String rol, String permisos) {
        super(id, nombre, descripcion, precio, stock, descuento);
        this.rol = rol;
        this.permisos = permisos;
    }

    // Getters y Setters
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    // Métodos adicionales específicos para administradores
    public void asignarPermisos(String nuevosPermisos) {
        setPermisos(nuevosPermisos);
    }

    public boolean tienePermiso(String permiso) {
        return permisos != null && permisos.contains(permiso);
    }

}
