public class PagoPayPal extends SistemaDePago {

    @Override
    public void iniciarPago() {
        System.out.println("Iniciando pago con PayPal");
    }

    @Override
    public void verificarPago() {
        System.out.println("Verificando pago con PayPal");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago con PayPal confirmado");
    }
}

