package pizzeria;

import ingrediente.Masa;
import ingrediente.Salsa;
import ingrediente.Queso;

import java.util.List;

public class PizzaNuevaYork extends Pizza {
    private String estiloCorte;

    public PizzaNuevaYork(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String estiloCorte) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.estiloCorte = estiloCorte;
    }

    @Override
    public void especial() {
        System.out.println("Estilo de corte: " + estiloCorte);
    }
}
