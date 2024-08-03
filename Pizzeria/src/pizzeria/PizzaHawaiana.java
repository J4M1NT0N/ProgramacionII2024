package pizzeria;

import ingrediente.Masa;
import ingrediente.Salsa;
import ingrediente.Queso;

import java.util.List;

public class PizzaHawaiana extends Pizza {
    private String ingredientesExtra;

    public PizzaHawaiana(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String ingredientesExtra) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.ingredientesExtra = ingredientesExtra;
    }

    @Override
    public void especial() {
        System.out.println("Ingredientes extra: " + ingredientesExtra);
    }
}