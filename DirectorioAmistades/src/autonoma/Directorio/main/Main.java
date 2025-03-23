
package autonoma.Directorio.main;

import autonoma.Directorio.models.Aplicacion;
import autonoma.Directorio.views.VentanaPrincipal;

public class Main {
     public static void main(String[] args) {
        // Crear la aplicación
        Aplicacion aplicacion = new Aplicacion();
        
        VentanaPrincipal ventana = new VentanaPrincipal(aplicacion);
        ventana.setVisible(true);
       
    }
}
