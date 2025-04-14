package Usuarios;

import java.util.List;
import Atracciones.Atraccion;
import Servicios.LugarServicio;

public class Administrador extends Usuario {
    private List<String> permisos;

    public Administrador(String nombre, int id, List<String> permisos, 
                        String login, String password) {
        super(nombre, id, login, password);
        this.permisos = permisos;
    }

    public void gestionarAtraccion(Atraccion atraccion, boolean activar) {
        atraccion.estado = activar;
    }

    public void asignarEmpleado(Empleado empleado, LugarServicio lugar) {
        lugar.asignarEmpleado(empleado);
    }

    public boolean tienePermiso(String permiso) {
        return permisos.contains(permiso);
    }
}

