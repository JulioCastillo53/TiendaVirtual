import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarritoDeComprasTest {

    private CarritoDeCompras carrito;
    private Producto producto1;
    private Producto producto2;
    private Usuario usuario;

    @Before
    public void setUp() throws ProductoNuloException {
        usuario = new Cliente(1, "Juan Perez", "juan.perez@example.com", "password123", "123 Calle Falsa", "Tarjeta de Crédito", "555-1234");
        producto1 = new ProductoDigital(1, "Curso de Java Avanzado", "Curso completo de Java para desarrolladores avanzados", 49.99f, 100, 10.0f, "MP4", 1500.0f, "http://example.com/download/java-avanzado", true);
        producto2 = new ProductoDigital(2, "Curso de Python", "Curso completo de Python", 59.99f, 100, 5.0f, "MP4", 1200.0f, "http://example.com/download/python", true);
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        carrito = new CarritoDeCompras(1, usuario, productos);
    }

    @Test
    public void agregarProducto() throws ProductoNuloException {
        carrito.agregarProducto(producto2);
        assertTrue(carrito.getProductos().contains(producto2));
    }

    @Test(expected = ProductoNuloException.class)
    public void agregarProductoNulo() throws ProductoNuloException {
        carrito.agregarProducto(null);
    }

    @Test
    public void eliminarProducto() throws ProductoNoEncontradoException, ProductoNuloException {
        carrito.eliminarProducto(producto1);
        assertFalse(carrito.getProductos().contains(producto1));
    }

    @Test(expected = ProductoNoEncontradoException.class)
    public void eliminarProductoNoExistente() throws ProductoNoEncontradoException, ProductoNuloException {
        carrito.eliminarProducto(producto2); // producto2 no está en el carrito
    }

    @Test(expected = ProductoNuloException.class)
    public void eliminarProductoNulo() throws ProductoNoEncontradoException, ProductoNuloException {
        carrito.eliminarProducto(null);
    }

    @Test
    public void actualizarCantidad() {
        carrito.actualizarCantidad();
        // Aquí podrías agregar lógica específica de prueba si el método actualizarCantidad tuviera implementación
    }

    @Test
    public void calcularTotal() throws CalculoTotalException {
        carrito.calcularTotal();
        assertEquals(49.99f, carrito.getTotal(), 0.001);
    }

    @Test
    public void getId() {
        assertEquals(1, carrito.getId());
    }

    @Test
    public void setId() {
        carrito.setId(2);
        assertEquals(2, carrito.getId());
    }

    @Test
    public void getUsuario() {
        assertEquals(usuario, carrito.getUsuario());
    }

    @Test
    public void setUsuario() {
        Usuario nuevoUsuario = new Cliente(2, "Ana Gomez", "ana.gomez@example.com", "password456", "456 Calle Verdadera", "Paypal", "555-5678");
        carrito.setUsuario(nuevoUsuario);
        assertEquals(nuevoUsuario, carrito.getUsuario());
    }

    @Test
    public void getProductos() {
        List<Producto> productos = carrito.getProductos();
        assertTrue(productos.contains(producto1));
    }

    @Test
    public void setProductos() throws ProductoNuloException {
        List<Producto> nuevosProductos = new ArrayList<>();
        nuevosProductos.add(producto2);
        carrito.setProductos(nuevosProductos);
        assertTrue(carrito.getProductos().contains(producto2));
        assertFalse(carrito.getProductos().contains(producto1));
    }

    @Test
    public void getTotal() {
        assertEquals(0.0f, carrito.getTotal(), 0.001);
    }

    @Test
    public void setTotal() {
        carrito.setTotal(99.99f);
        assertEquals(99.99f, carrito.getTotal(), 0.001);
    }
}
