public class PagoTarjetaCredito extends SistemaDePago {

    @Override
    public void iniciarPago() {
        System.out.println("Iniciando pago con tarjeta de crédito");
    }

    @Override
    public void verificarPago() {
        System.out.println("Verificando pago con tarjeta de crédito");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago con tarjeta de crédito confirmado");
    }
}
