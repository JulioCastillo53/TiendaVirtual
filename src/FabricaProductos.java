import java.util.Map;

public class FabricaProductos {

    private FabricaProductos() {
        // Este constructor privado evita que se instancie la clase.
    }

    public static Producto crearProducto(String tipoProducto, Map<String, String> parametros) {
        switch (tipoProducto.toLowerCase()) {
            case "digital":
                return crearProductoDigital(parametros);
            case "físico":
                return crearProductoFisico(parametros);
            default:
                throw new IllegalArgumentException("Tipo de producto no válido: " + tipoProducto);
        }
    }

    private static ProductoDigital crearProductoDigital(Map<String, String> parametros) {
        int id = Integer.parseInt(parametros.get("id"));
        String nombre = parametros.get("nombre");
        float precio = Float.parseFloat(parametros.get("precio"));
        return new ProductoDigital(id, nombre, precio);
    }

    private static ProductoFisico crearProductoFisico(Map<String, String> parametros) {
        int id = Integer.parseInt(parametros.get("id"));
        String nombre = parametros.get("nombre");
        float precio = Float.parseFloat(parametros.get("precio"));
        return new ProductoFisico(id, nombre, precio);
    }
}

