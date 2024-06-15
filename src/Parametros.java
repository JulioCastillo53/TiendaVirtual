import java.util.HashMap;
import java.util.Map;

public class Parametros {

    private static final String DEFAULT_DB_HOST = "localhost";
    private static final String DEFAULT_DB_NAME = "onlineStoreDB";
    private static final String DEFAULT_DB_USER = "user-onlineStoreDB";
    private static final String DEFAULT_DB_PASSWORD = "848des";

    private static final String DEFAULT_UI_THEME = "darkSide";
    private static final String DEFAULT_UI_LANGUAGE = "español";

    private static Parametros instance;

    private final Map<String,String> parametrosConexionDB;
    private final Map<String,String> configuracionesUI;

    private Parametros() {
        parametrosConexionDB = new HashMap<>();
        configuracionesUI = new HashMap<>();

        parametrosConexionDB.put("host", DEFAULT_DB_HOST);
        parametrosConexionDB.put("database", DEFAULT_DB_NAME);
        parametrosConexionDB.put("user", DEFAULT_DB_USER);
        parametrosConexionDB.put("password", DEFAULT_DB_PASSWORD);

        configuracionesUI.put("tema", DEFAULT_UI_THEME);
        configuracionesUI.put("idioma", DEFAULT_UI_LANGUAGE);
    }

    public static synchronized Parametros getInstance() {
        if (instance == null) {
            instance = new Parametros();
        }
        return instance;
    }

    public Map<String, String> getParametrosConexionDB() {
        return new HashMap<>(parametrosConexionDB);
    }

    public Map<String, String> getConfiguracionesUI() {
        return new HashMap<>(configuracionesUI);
    }

    public String getParametroDB(String nombreParametro) {
        return parametrosConexionDB.getOrDefault(nombreParametro, "null");
    }

    public String getParametroUI(String nombreParametro) {
        return configuracionesUI.getOrDefault(nombreParametro, "null");
    }

    public String setParametrosConexionDB(String parametro, String valor) {
        if (parametrosConexionDB.containsKey(parametro)) {
            parametrosConexionDB.replace(parametro, valor);
            return "Parámetro " + parametro + " fue modificado exitosamente.";
        } else {
            return "null";
        }
    }

    public String setConfiguracionesUI(String parametro, String valor) {
        if (configuracionesUI.containsKey(parametro)) {
            configuracionesUI.replace(parametro, valor);
            return "Parámetro " + parametro + " fue modificado exitosamente.";
        } else {
            return "null";
        }
    }
}
