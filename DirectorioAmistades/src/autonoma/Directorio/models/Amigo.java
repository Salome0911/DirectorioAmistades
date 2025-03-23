
package autonoma.Directorio.models;


public class Amigo {
    private final String nombre;
    private final String telefono;
    private final String correo;

    public Amigo(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
}
