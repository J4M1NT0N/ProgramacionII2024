package Fabrica_de_Calzado;

public class ZapatoDeportivoHombre extends Zapato {

    public ZapatoDeportivoHombre() {
        this.material = "Tela";
        this.suela = "Caucho";
        this.diseno = "Deportivo Hombre";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Zapato Deportivo Hombre - Material: " + material + ", Suela: " + suela + ", Diseño: " + diseno);
    }
}
