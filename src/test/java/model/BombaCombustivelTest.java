package model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BombaCombustivelTest {

    @Test
    public void testGetSetIdentificadorBomba() {
        String identificadorEsperado = "B001";
        BombaCombustivel bomba = new BombaCombustivel(identificadorEsperado, new TipoCombustivel("Gasolina"));
        assertEquals(identificadorEsperado, bomba.getIdentificadorBomba());

        String novoIdentificador = "B002";
        bomba.setIdentificadorBomba(novoIdentificador);
        assertEquals(novoIdentificador, bomba.getIdentificadorBomba());
    }

    @Test
    public void testGetSetTipoCombustivel() {
        TipoCombustivel tipoEsperado = new TipoCombustivel("Diesel");
        BombaCombustivel bomba = new BombaCombustivel("B003", tipoEsperado);
        assertEquals(tipoEsperado, bomba.getTipoCombustivel());

        TipoCombustivel novoTipo = new TipoCombustivel("Etanol");
        bomba.setTipoCombustivel(novoTipo);
        assertEquals(novoTipo, bomba.getTipoCombustivel());
    }
}