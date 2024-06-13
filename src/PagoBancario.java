public class PagoBancario extends SistemaDePago {

    @Override
    public void iniciarPago() {
        System.out.println("Iniciando pago bancario");
    }

    @Override
    public void verificarPago() {
        System.out.println("Verificando pago bancario");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago bancario confirmado");
    }
}