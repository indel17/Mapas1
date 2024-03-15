import java.util.HashMap;
import java.util.Map;

public class Ubicacion {

    public int id;
    public String descripcion;
    Map<String, Integer> ubicaciones;

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.ubicaciones = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getUbicaciones() {
        return ubicaciones;
    }
/*Método addExit, tiene dos parámetros: direccion (String), idUbicacion
(entero). Añade una entrada al mapa de salidas con clave dirección y valor
idUbicacion.*/

    public void addExit(String direccion, int idUbicacion){
        ubicaciones.put(direccion,idUbicacion);

    }
}
