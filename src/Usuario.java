public class Usuario {

    private int id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private String direccion;

    public Usuario(int id, String nombre, String correoElectronico, String contrasena, String direccion) {
        setId(id);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        setContrasena(contrasena);
        setDireccion(direccion);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null || !correoElectronico.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("El correo electrónico no es válido.");
        }
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        if (contrasena == null || contrasena.length() < 6) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 6 caracteres.");
        }
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }
        this.direccion = direccion;
    }

    public void registrarUsuario() {
        System.out.println("Usuario registrado");
    }

    public void iniciarSesion() {
        System.out.println("Sesión iniciada");
    }

    public void actualizarPerfil() {
        System.out.println("Perfil actualizado");
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada");
    }

}
