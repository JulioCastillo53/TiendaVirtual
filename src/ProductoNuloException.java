public class ProductoNuloException extends CarritoDeComprasException {
    public ProductoNuloException() {
        super("No se puede agregar un producto nulo al carrito");
    }
}
