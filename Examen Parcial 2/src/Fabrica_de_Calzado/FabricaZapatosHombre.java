package Fabrica_de_Calzado;

public class FabricaZapatosHombre implements FabricaZapatos {

    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivoHombre();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormalHombre();
    }
}