package Fabrica_de_Calzado;

public class ZapatoFormalHombre extends Zapato {

    public ZapatoFormalHombre() {
        this.material = "Cuero";
        this.suela = "Goma";
        this.diseno = "Formal Hombre";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Zapato Formal Hombre - Material: " + material + ", Suela: " + suela + ", Diseño: " + diseno);
    }
}
