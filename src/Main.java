import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*CLASES BASE*/
        System.out.println("\nCLASES BASE--------------------------------------------\n");

        Usuario primerUsuario = new Usuario(8, "Pedro", "pedro@hotmail.com", "1234123487",
                "Autopista Norte Calle 24");
        System.out.println(primerUsuario.toString()); //Imprime solo la dirección en memoria
        System.out.println(primerUsuario.getId());
        System.out.println(primerUsuario.getNombre());
        System.out.println(primerUsuario.getCorreoElectronico());
        System.out.println(primerUsuario.getContrasena());
        System.out.println(primerUsuario.getDireccion());
        System.out.println(" ");

        /*HERENCIA*/

        System.out.println("\nHERENCIA--------------------------------------------\n");

        // Crear instancia de Cliente
        Cliente cliente = new Cliente(
                1, "Juan Perez", "juan.perez@example.com", "password123", "Calle Falsa 123",
                "5551234567", "Tarjeta de Crédito"
        );

        // Mostrar información del cliente
        System.out.println("Cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
        System.out.println("Método de Pago Preferido: " + cliente.getMetodoPagoPreferido());
        System.out.println();

        // Crear instancia de Administrador
        Administrador admin = new Administrador(
                2, "Ana Gomez", "ana.gomez@example.com", "adminpass", "Avenida Siempre Viva 742",
                "Admin", "todos"
        );

        // Mostrar información del administrador
        System.out.println("Administrador:");
        System.out.println("Nombre: " + admin.getNombre());
        System.out.println("Correo Electrónico: " + admin.getCorreoElectronico());
        System.out.println("Rol: " + admin.getRol());
        System.out.println("Permisos: " + admin.getPermisos());
        System.out.println();

        // Crear instancia de ProductoFisico
        ProductoFisico productoFisico = new ProductoFisico(
                1, "Laptop", "Laptop de alta gama", 1500.0f, 10, 0.1f,
                5.0f, "12x17x45", "metal", "q-rtGYEww-Xxiuser-374580-modellerxy"
        );

        // Mostrar información del producto físico
        System.out.println("Producto Físico:");
        System.out.println("Nombre: " + productoFisico.getNombre());
        System.out.println("Descripción: " + productoFisico.getDescripcion());
        System.out.println("Precio: " + productoFisico.getPrecio());
        System.out.println("Peso: " + productoFisico.getPeso());
        System.out.println();

        // Crear instancia de ProductoDigital
        ProductoDigital productoDigital = new ProductoDigital(
                2, "E-book", "Libro electrónico de programación",
                30.0f, 100, 0.2f, "PDF", 1024.0f,
                "biblioteca/libros/tecnologia/poo.pdf", true
        );

        // Mostrar información del producto digital
        System.out.println("Producto Digital:");
        System.out.println("Nombre: " + productoDigital.getNombre());
        System.out.println("Descripción: " + productoDigital.getDescripcion());
        System.out.println("Precio: " + productoDigital.getPrecio());
        System.out.println("Formato: " + productoDigital.getFormato());
        System.out.println(" ");

        /*POLIMORFISMO*/
        System.out.println("\nPOLIMORFISMO--------------------------------------------\n");

        //Sobrecarga de constructores
        //Tres productos que reciben los 3 constructores de Producto
        Producto primero = new Producto(1);
        Producto segundo = new Producto(500, 10);
        Producto tercero = new Producto(2, "Televisor", "50 pulgadas, OLED", 230.34f, 43, 12.4f);

        ////Dos productos uno físico y digital
        ProductoDigital cuarto = new ProductoDigital(17);
        ProductoFisico quinto = new ProductoFisico(7);

        //Imprimimos los datos de cada Producto
        System.out.println(primero.getNombre());
        System.out.println(segundo.getNombre());
        System.out.println(tercero.getNombre());
        System.out.println(cuarto.getFormato());
        System.out.println(quinto.getDimensiones());

        //Sobrecarga de métodos
        ProductoDigital unproducto = new ProductoDigital(14);
        ProductoFisico otroproducto = new ProductoFisico(14.23f, 8f);

        System.out.println("El precio final del producto digital es: " + unproducto.calcularPrecioFinal());
        System.out.println("El precio final del producto físico es: " + otroproducto.calcularPrecioFinal());

        /* ABSTRACCIÓN */
        System.out.println("\nABSTRACCIÓN--------------------------------------------\n");

        InventarioFisico inventarioFisicoGeneral = new InventarioFisico(200);
        InventarioDigital inventarioDigitalGeneral = new InventarioDigital(740);

        System.out.println(inventarioFisicoGeneral.getCantidad());
        System.out.println(inventarioDigitalGeneral.getCantidad());

        SistemaDePago pagoPayPal = new PagoPayPal();
        SistemaDePago pagoTarjetaCredito = new PagoTarjetaCredito();
        SistemaDePago pagoBancario = new PagoBancario();

        // Realizar operaciones con PayPal
        System.out.println("Proceso de pago con PayPal:");
        pagoPayPal.iniciarPago();
        pagoPayPal.verificarPago();
        pagoPayPal.confirmarPago();
        System.out.println();
        // Realizar operaciones con tarjeta de crédito
        System.out.println("Proceso de pago con Tarjeta de Crédito:");
        pagoTarjetaCredito.iniciarPago();
        pagoTarjetaCredito.verificarPago();
        pagoTarjetaCredito.confirmarPago();
        System.out.println();
        // Realizar operaciones con pago bancario
        System.out.println("Proceso de pago Bancario:");
        pagoBancario.iniciarPago();
        pagoBancario.verificarPago();
        pagoBancario.confirmarPago();

        /* ENCAPSULAMIENTO */
        System.out.println("\nENCAPSULAMIENTO--------------------------------------------\n");

        Usuario usuario = new Usuario(1, "Juan", "juan@example.com", "contrasena123", "Calle Principal 123");

        // Crear productos
        Producto producto1 = new Producto(1, "Camisa", "Camisa de algodón", 25.0f, 10, 5.0f);
        Producto producto2 = new Producto(2, "Pantalón", "Pantalón de mezclilla", 35.0f, 8, 0.0f);

        // Crear un carrito de compras
        List<Producto> productosCarrito = new ArrayList<>();
        productosCarrito.add(producto1);
        productosCarrito.add(producto2);
        CarritoDeCompras carrito = null;
        try {
            carrito = new CarritoDeCompras(1, usuario, productosCarrito);
        } catch (ProductoNuloException e) {
            throw new RuntimeException(e);
        }

        // Agregar un producto al carrito
        Producto nuevoProducto = new Producto(3, "Zapatos", "Zapatos de cuero", 50.0f, 5, 0.0f);
        try {
            carrito.agregarProducto(nuevoProducto);
        } catch (ProductoNuloException e) {
            throw new RuntimeException(e);
        }

        // Calcular el total del carrito
        try {
            carrito.calcularTotal();
        } catch (CalculoTotalException e) {
            throw new RuntimeException(e);
        }

        // Actualizar la cantidad de un producto en el carrito
        producto1.setStock(9);
        carrito.actualizarCantidad();

        // Eliminar un producto del carrito
        try {
            carrito.eliminarProducto(producto2);
        } catch (ProductoNoEncontradoException e) {
            throw new RuntimeException(e);
        } catch (ProductoNuloException e) {
            throw new RuntimeException(e);
        }

        /* PATRONES */
        System.out.println("\nPATRONES--------------------------------------------\n");

        Parametros configuracion = Parametros.getInstance();

        // Obtener parámetros de conexión a la base de datos
        Map<String, String> parametrosDB = configuracion.getParametrosConexionDB();
        System.out.println("Parámetros de conexión a la base de datos: " + parametrosDB);

        // Obtener parámetros de configuración de la interfaz de usuario
        Map<String, String> parametrosUI = configuracion.getConfiguracionesUI();
        System.out.println("Configuraciones de la interfaz de usuario: " + parametrosUI);

        // Modificar un parámetro de conexión a la base de datos
        configuracion.setParametrosConexionDB("host", "db.example.com");
        System.out.println("Nuevo parámetro de conexión a la base de datos: " +
                configuracion.getParametroDB("host"));

        // Modificar un parámetro de configuración de la interfaz de usuario
        configuracion.setConfiguracionesUI("tema", "lightMode");
        System.out.println("Nuevo parámetro de configuración de la interfaz de usuario: " +
                configuracion.getParametroUI("tema"));

        // Usando la clase ProductoFactory
        Map<String, String> parametrosProducto = new HashMap<>();
        parametrosProducto.put("id", "1");
        parametrosProducto.put("nombre", "Libro de Java");
        parametrosProducto.put("precio", "29.99");

        Producto productoDigitalFAC = FabricaProductos.crearProducto("digital", parametrosProducto);
        System.out.println("Producto físico creado: \n Objeto: " + productoDigitalFAC + "{id: " + productoDigitalFAC.getId() + ", Nombre: " + productoDigitalFAC.getNombre() + ", Precio: " + productoDigitalFAC.getPrecio() + "}");

        parametrosProducto.put("id", "2");
        parametrosProducto.put("nombre", "Camisa");
        parametrosProducto.put("precio", "19.99");

        Producto productoFisicoFAC = FabricaProductos.crearProducto("físico", parametrosProducto);
        System.out.println("Producto físico creado: \n Objeto: " + productoFisicoFAC + "{id: " + productoFisicoFAC.getId() + ", Nombre: " + productoFisicoFAC.getNombre() + ", Precio: " + productoFisicoFAC.getPrecio() + "}");

        System.out.println("\nPATRÓN OBSERVER--------------------------------------------\n");

        Cliente clienteOB = new Cliente(1, "Juan Perez", "juan.perez@example.com", "password123", "123 Calle Falsa", "Tarjeta de Crédito", "555-1234");

        // Crear una instancia de ProductoDigital
        ProductoDigital producto = new ProductoDigital(
                1,
                "Curso de Java Avanzado",
                "Curso completo de Java para desarrolladores avanzados",
                49.99f,
                100,
                10.0f,
                "MP4",
                1500.0f,
                "http://example.com/download/java-avanzado",
                true
        );

        // Crear una instancia de Resena
        Resena resena = new Resena(1, clienteOB, producto, 5, "Excelente curso, muy completo y bien explicado.", new Date());
        ResenaObserver observer = new ResenaObserver();

        // Registrar el observador
        resena.addObserver(observer);

        // Realizar acciones en la reseña
        resena.agregarResena();
        resena.editarResena();
        resena.eliminarResena();
        resena.moderarResena();

        // Actualizar propiedades de la reseña
        resena.setComentario("Comentario actualizado");

    }
}
