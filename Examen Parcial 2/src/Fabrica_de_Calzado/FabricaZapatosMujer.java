package Fabrica_de_Calzado;

public class FabricaZapatosMujer implements FabricaZapatos {

    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivoMujer();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormalMujer();
    }
}