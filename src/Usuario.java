public class Usuario {

    private int id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private String direccion;

    public Usuario(int id, String nombre, String correoElectronico, String contrasena, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
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
