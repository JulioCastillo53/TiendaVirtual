//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

        Producto primero = new Producto(1);
        Producto segundo = new Producto(500, 10);
        Producto tercero = new Producto(2, "Televisor","50 pulgadas, OLED", 230.34f, 43, 12.4f);

        ProductoDigital cuarto = new ProductoDigital(17);
        ProductoFisico quinto = new ProductoFisico(7);

        System.out.println(primero.getNombre());
        System.out.println(segundo.getNombre());
        System.out.println(tercero.getNombre());
        System.out.println(cuarto.getFormato());
        System.out.println(quinto.getDimensiones());

    }
}
