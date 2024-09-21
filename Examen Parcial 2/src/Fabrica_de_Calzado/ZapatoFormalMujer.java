package Fabrica_de_Calzado;

public class ZapatoFormalMujer extends Zapato {

    public ZapatoFormalMujer() {
        this.material = "Cuero";
        this.suela = "Goma";
        this.diseno = "Formal Mujer";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Zapato Formal Mujer - Material: " + material + ", Suela: " + suela + ", Diseño: " + diseno);
    }
}
