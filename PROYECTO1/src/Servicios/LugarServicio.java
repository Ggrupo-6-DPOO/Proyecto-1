package Servicios;

import Usuarios.Empleado;
import java.util.List;

public abstract class LugarServicio {
    private TipoLugar tipo;
    private List<Empleado> empleadosAsignados;

    public LugarServicio(TipoLugar tipo) {
        this.tipo = tipo;
        this.empleadosAsignados = new ArrayList<>();
    }

    // Método para asignar empleados con validación
    public void asignarEmpleado(Empleado empleado) {
        if (empleado.getRol() == RolEmpleado.CAJERO || 
            empleado.getRol() == RolEmpleado.SERVICIO_GENERAL) {
            empleadosAsignados.add(empleado);
        } else {
            throw new IllegalArgumentException("Rol no válido para este servicio");
        }
    }

    // Método abstracto para calcular ganancias
    public abstract double calcularGanancias();

    // Getters
    public TipoLugar getTipo() {
        return tipo;
    }

    public List<Empleado> getEmpleadosAsignados() {
        return new ArrayList<>(empleadosAsignados); // Copia defensiva
    }
}