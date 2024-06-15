import java.util.Date;
import java.util.Observable;

public class Resena extends Observable {

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
        setChanged();
        notifyObservers("Reseña agregada");
    }

    public void editarResena() {
        System.out.println("Reseña editada");
        setChanged();
        notifyObservers("Reseña editada");
    }

    public void eliminarResena() {
        System.out.println("Reseña eliminada");
        setChanged();
        notifyObservers("Reseña eliminada");
    }

    public void moderarResena() {
        System.out.println("Reseña moderada");
        setChanged();
        notifyObservers("Reseña moderada");
    }

    // Getters and Setters for id, usuario, producto, calificacion, comentario, fecha

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        setChanged();
        notifyObservers("ID actualizado");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        setChanged();
        notifyObservers("Usuario actualizado");
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        setChanged();
        notifyObservers("Producto actualizado");
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
        setChanged();
        notifyObservers("Calificación actualizada");
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
        setChanged();
        notifyObservers("Comentario actualizado");
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
        setChanged();
        notifyObservers("Fecha actualizada");
    }
}
