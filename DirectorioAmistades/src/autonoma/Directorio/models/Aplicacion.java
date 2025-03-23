
package autonoma.Directorio.models;

import autonoma.Directorio.exceptions.AmigoException;
import autonoma.Directorio.exceptions.AmigoYaRegistradoException;
import autonoma.Directorio.exceptions.CorreoInvalidoException;
import autonoma.Directorio.exceptions.TelefonoInvalidoException;
import autonoma.Directorio.exceptions.AmigoNoEncontradoException;
import java.util.ArrayList;
import java.util.List;


public class Aplicacion {
     private final List<Amigo> amigos;

    public Aplicacion() {
        amigos = new ArrayList<>();
    }

    public void agregarAmigo(Amigo amigo) throws AmigoException {
        // Validar correo
        if (!amigo.getCorreo().contains("@")) {
            throw new CorreoInvalidoException("El correo electronico no es valido.");
        }

        // Validar teléfono
        if (!amigo.getTelefono().startsWith("606") && !amigo.getTelefono().startsWith("57")) {
            throw new TelefonoInvalidoException("El telefono no es valido.");
        }

        // Verificar si el amigo ya está registrado
        for (Amigo a : amigos) {
            if (a.getCorreo().equals(amigo.getCorreo())) {
                throw new AmigoYaRegistradoException("El amigo ya esta registrado.");
            }
        }

        amigos.add(amigo);
    }

    public Amigo buscarAmigo(String correo) throws AmigoException {
        for (Amigo a : amigos) {
            if (a.getCorreo().equals(correo)) {
                return a;
            }
        }
        throw new AmigoNoEncontradoException("Amigo no encontrado.");
    }

    public void mostrarAcercaDe() {
        System.out.println("Taller: Registro de Amigos");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        System.out.println("Universidad: UAM");
        System.out.println("Desarrolladores: Salomé Carmona - Salomé Toro");
    }

    public void salir() {
        System.out.println("Saliendo de la aplicacion...");
        System.exit(0);
    }
}
