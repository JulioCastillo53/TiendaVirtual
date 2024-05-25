import java.util.Date;

public class Resena {

    private int id;
    private Usuario usuario;
    private Producto producto;
    private int calificacion;
    private String comentario;
    private Date fecha;

    public Resena(int id, Usuario usuario, Producto producto, int calificacion, String comentario, Date fecha) {
        this.id = id;
        this.usuario = usuario;
        this.producto = producto;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public void agregarResena() {
        System.out.println("Reseña agregada");
    }

    public void editarResena() {
        System.out.println("Reseña editada");
    }

    public void eliminarResena() {
        System.out.println("Reseña eliminada");
    }

    public void moderarResena() {
        System.out.println("Reseña moderada");
    }

}
