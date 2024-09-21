package Fabrica_de_Calzado;

public class ClienteZapatos {
    private FabricaZapatos fabrica;

    public ClienteZapatos(FabricaZapatos fabrica) {
        this.fabrica = fabrica;
    }

    public void mostrarZapatos() {
        Zapato zapatoDeportivo = fabrica.crearZapatoDeportivo();
        Zapato zapatoFormal = fabrica.crearZapatoFormal();

        zapatoDeportivo.mostrarInfo();
        zapatoFormal.mostrarInfo();
    }

    public static void main(String[] args) {
        FabricaZapatos fabricaHombre = new FabricaZapatosHombre();
        FabricaZapatos fabricaMujer = new FabricaZapatosMujer();
        FabricaZapatos fabricaNino = new FabricaZapatosNiño();

        System.out.println("Zapatos para Hombre:");
        ClienteZapatos clienteHombre = new ClienteZapatos(fabricaHombre);
        clienteHombre.mostrarZapatos();

        System.out.println("\nZapatos para Mujer:");
        ClienteZapatos clienteMujer = new ClienteZapatos(fabricaMujer);
        clienteMujer.mostrarZapatos();

        System.out.println("\nZapatos para Niños:");
        ClienteZapatos clienteNino = new ClienteZapatos(fabricaNino);
        clienteNino.mostrarZapatos();
    }
}
