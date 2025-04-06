package Usuarios;

import java.util.List;

public class Administrador extends Usuario {
    private List<String> permisos;

    public Administrador(String nombre, int id, List<String> permisos, String login, String password) {
        super(nombre, id, login, password);
        this.permisos = permisos;
    }

    public void gestionarAtracciones() {
        // Me falta ver como hacen la logica de atracciones y las otras para hacer esta parte
    }

    public void gestionarEmpleados() {
        // Me falta ver como hacen la logica de atracciones y las otras para hacer esta parte
    }

    public void gestionarTiquetes() {
        // Me falta ver como hacen la logica de atracciones y las otras para hacer esta parte
    }

    public boolean tienePermiso(String permiso) {
        return permisos.contains(permiso);
    }
}

