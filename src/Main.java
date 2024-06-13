//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*CLASES BASE*/
        Usuario primerUsuario = new Usuario(8, "Pedro","pedro@hotmail.com", "1234123487",
                "Autopista Norte Calle 24");
        System.out.println(primerUsuario.toString()); //Imprime solo la dirección en memoria
        System.out.println(primerUsuario.getId());
        System.out.println(primerUsuario.getNombre());
        System.out.println(primerUsuario.getCorreoElectronico());
        System.out.println(primerUsuario.getContrasena());
        System.out.println(primerUsuario.getDireccion());
        System.out.println(" ");

        /*HERENCIA*/
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
                5.0f, "12x17x45", "metal","q-rtGYEww-Xxiuser-374580-modellerxy"
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
                30.0f, 100, 0.2f, "PDF",1024.0f,
                "biblioteca/libros/tecnologia/poo.pdf",true
        );

        // Mostrar información del producto digital
        System.out.println("Producto Digital:");
        System.out.println("Nombre: " + productoDigital.getNombre());
        System.out.println("Descripción: " + productoDigital.getDescripcion());
        System.out.println("Precio: " + productoDigital.getPrecio());
        System.out.println("Formato: " + productoDigital.getFormato());
        System.out.println(" ");

        /*POLIMORFISMO*/

        //Sobrecarga de constructores
        //Tres productos que reciben los 3 constructores de Producto
        Producto primero = new Producto(1);
        Producto segundo = new Producto(500, 10);
        Producto tercero = new Producto(2, "Televisor","50 pulgadas, OLED", 230.34f, 43, 12.4f);

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
        ProductoFisico otroproducto = new ProductoFisico(14.23f,8f);

        System.out.println("El precio final del producto digital es: " + unproducto.calcularPrecioFinal());
        System.out.println("El precio final del producto físico es: " + otroproducto.calcularPrecioFinal());

        /* ABSTRACCIÓN */

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

    }
}
