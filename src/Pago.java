import java.util.Date;

public class Pago {

    private int id;
    private Pedido pedido;
    private float monto;
    private String metodoPago;
    private Date fecha;

    public Pago(int id, Pedido pedido, float monto, String metodoPago, Date fecha) {
        this.id = id;
        this.pedido = pedido;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
    }

    public void procesarPago() {
        System.out.println("Pago procesado");
    }

    public void confirmarPago() {
        System.out.println("Pago confirmado");
    }

    public void cancelarPago() {
        System.out.println("Pago cancelado");
    }

}
