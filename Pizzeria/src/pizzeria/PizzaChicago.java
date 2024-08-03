package pizzeria;

import ingrediente.Masa;
import ingrediente.Salsa;
import ingrediente.Queso;

import java.util.List;

public class PizzaChicago extends Pizza {
    private String grosorMasa;

    public PizzaChicago(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String grosorMasa) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.grosorMasa = grosorMasa;
    }

    @Override
    public void especial() {
        System.out.println("Grosor de la masa: " + grosorMasa);
    }
}
