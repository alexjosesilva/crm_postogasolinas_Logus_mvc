package model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TipoCombustivelTest {

    @Test
    public void testGetSetNome() {
        String nomeEsperado = "Gasolina";
        TipoCombustivel tipo = new TipoCombustivel();
        tipo.setNome(nomeEsperado);
        assertEquals(nomeEsperado, tipo.getNome());
    }
}
