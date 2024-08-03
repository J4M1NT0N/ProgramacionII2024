package pizzeria;

import ingrediente.Masa;
import ingrediente.Salsa;
import ingrediente.Queso;

import java.util.List;

public abstract class Pizza {
    private String nombre;
    private String tamaño;
    private double precio;
    private Masa masa;
    private Salsa salsa;
    private Queso queso;

    public Pizza(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.masa = masa;
        this.salsa = salsa;
        this.queso = queso;
    }

    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    public void hornear() {
        System.out.println("Horneando " + nombre);
    }

    public void cortar() {
        System.out.println("Cortando " + nombre);
    }

    public void empacar() {
        System.out.println("Empacando " + nombre);
    }

    public abstract void especial();
}
