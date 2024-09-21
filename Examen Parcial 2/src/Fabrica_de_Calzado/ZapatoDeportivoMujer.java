package Fabrica_de_Calzado;

public class ZapatoDeportivoMujer extends Zapato {

    public ZapatoDeportivoMujer() {
        this.material = "Tela";
        this.suela = "Espuma sintetica";
        this.diseno = "Deportivo Mujer";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Zapato Deportivo Mujer - Material: " + material + ", Suela: " + suela + ", Diseño: " + diseno);
    }
}
