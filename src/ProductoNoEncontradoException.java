public class ProductoNoEncontradoException extends CarritoDeComprasException {
    public ProductoNoEncontradoException() {
        super("El producto no está en el carrito");
    }
}
