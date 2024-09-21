package Fabrica_de_Calzado;

public class ZapatoFormalNiño extends Zapato {

    public ZapatoFormalNiño() {
        this.material = "Cuero Sintético";
        this.suela = "Goma";
        this.diseno = "Formal Niño";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Zapato Formal Niño - Material: " + material + ", Suela: " + suela + ", Diseño: " + diseno);
    }
}
