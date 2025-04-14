package Atracciones;

import Usuarios.Cliente;
import java.util.List;

public class AtraccionCultural extends Atraccion {
    private int edadMinima;
    private boolean requiereSupervision; // Para menores de edad

    public AtraccionCultural(String nombre, String ubicacion, int cupoMaximo, 
                           int numMinEmpleados, NivelExclusividad exclusividad,
                           int edadMinima, boolean requiereSupervision) {
        super(nombre, ubicacion, cupoMaximo, numMinEmpleados, exclusividad);
        this.setEdadMinima(edadMinima);
        this.requiereSupervision = requiereSupervision;
    }

    @Override
    public boolean esAptaPara(Cliente cliente) {
        // Validación de edad
        boolean cumpleEdad = cliente.getEdad() >= edadMinima;
        
        // Validación de supervisión para menores
        boolean supervisionOk = !requiereSupervision || 
                              (cliente.getEdad() < 18 && cliente.isAcompaniado());

        return cumpleEdad && supervisionOk && super.verificarDisponibilidad();
    }

    // --- Métodos específicos ---
    public void actualizarEdadMinima(int nuevaEdad) {
        if (nuevaEdad < 0 || nuevaEdad > 18) {
            throw new IllegalArgumentException("Edad mínima debe ser entre 0 y 18 años");
        }
        this.edadMinima = nuevaEdad;
    }

    // --- Getters ---
    public int getEdadMinima() {
        return edadMinima;
    }

    public boolean requiereSupervision() {
        return requiereSupervision;
    }
}