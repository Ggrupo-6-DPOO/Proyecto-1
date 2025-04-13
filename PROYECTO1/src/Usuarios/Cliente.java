package Usuarios;

import java.util.ArrayList;

import java.util.List;
import parque.ventas.Tiquete;

public class Cliente extends Usuario {
    private int edad;
    private double altura;
    private double peso;
    private List<String> contraindicaciones;
    private List<Tiquete> tiquetesComprados;

    public Cliente(int id, String nombre, int edad, double altura, double peso,
                   List<String> contraindicaciones, String login, String password) {
        super(nombre, id, login, password);
        this.setEdad(edad);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setContraindicaciones(contraindicaciones != null ? contraindicaciones : new ArrayList<>());
        this.tiquetesComprados = new ArrayList<>();
    }

    public void comprarTiquete(Tiquete tiquete) {
        tiquetesComprados.add(tiquete);
    }

    public List<Tiquete> consultarTiquetes() {
        return tiquetesComprados;
    }
    public List<Tiquete> getTiquetesComprados() {
        return tiquetesComprados;
    }

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public List<String> getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(List<String> contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}
}
