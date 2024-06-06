public class Administrador extends Usuario{

    private String rol; // Rol del administrador
    private String permisos; // Permisos específicos del administrador

    public Administrador(int id, String nombre, String correoElectronico, String contrasena, String direccion, String rol, String permisos) {
        super(id, nombre, correoElectronico, contrasena, direccion);
        this.rol = rol;
        this.permisos = permisos;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Métodos adicionales específicos para administradores
    public void asignarPermisos(String nuevosPermisos) {
        setPermisos(nuevosPermisos);
    }

    public boolean tienePermiso(String permiso) {
        return permisos != null && permisos.contains(permiso);
    }

}
