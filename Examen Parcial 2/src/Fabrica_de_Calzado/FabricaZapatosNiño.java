package Fabrica_de_Calzado;

public class FabricaZapatosNiño implements FabricaZapatos {

    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivoNiño();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormalNiño();
    }
}
