import java.util.Observable;
import java.util.Observer;

public class ResenaObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Resena) {
            Resena resena = (Resena) o;
            System.out.println("Observador notificado: " + arg);
            // Aquí puedes agregar lógica adicional para manejar los cambios en la reseña.
        }
    }
}
