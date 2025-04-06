package Usuarios;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private int edad;
    private double altura;
    private double peso;
    private List<String> contraindicaciones;
    private List<Tiquete> tiquetesComprados;

    public Cliente(int id, String nombre, int edad, double altura, double peso,
                   List<String> contraindicaciones, String login, String password) {
        super(nombre, id, login, password);
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.contraindicaciones = contraindicaciones != null ? contraindicaciones : new ArrayList<>();
        this.tiquetesComprados = new ArrayList<>();
    }

    public void comprarTiquete(Tiquete tiquete) {
        tiquetesComprados.add(tiquete);
    }

    public List<Tiquete> consultarTiquetes() {
        return tiquetesComprados;
    }
}
