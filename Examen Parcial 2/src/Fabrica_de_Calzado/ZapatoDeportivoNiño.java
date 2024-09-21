package Fabrica_de_Calzado;

public class ZapatoDeportivoNiño extends Zapato {

    public ZapatoDeportivoNiño() {
        this.material = "Sintético";
        this.suela = "Plástico";
        this.diseno = "Deportivo Niño";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Zapato Deportivo Niño - Material: " + material + ", Suela: " + suela + ", Diseño: " + diseno);
    }
}
