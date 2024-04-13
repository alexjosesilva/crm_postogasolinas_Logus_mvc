package model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ModeloVeiculoTest {

    @Test
    public void testGetSetNomeModelo() {
        String nomeEsperado = "Fiesta";
        ModeloVeiculo modelo = new ModeloVeiculo();
        modelo.setNomeModelo(nomeEsperado);
        assertEquals(nomeEsperado, modelo.getNomeModelo());
    }

    @Test
    public void testGetSetConsumoEtanol() {
        double consumoEsperado = 8.5;
        ModeloVeiculo modelo = new ModeloVeiculo();
        modelo.setConsumoEtanol(consumoEsperado);
        assertEquals(consumoEsperado, modelo.getConsumoEtanol(), 0.01);
    }

    @Test
    public void testGetSetConsumoGasolina() {
        double consumoEsperado = 12.5;
        ModeloVeiculo modelo = new ModeloVeiculo();
        modelo.setConsumoGasolina(consumoEsperado);
        assertEquals(consumoEsperado, modelo.getConsumoGasolina(), 0.01);
    }

    @Test
    public void testGetSetConsumoDiesel() {
        double consumoEsperado = 10.0;
        ModeloVeiculo modelo = new ModeloVeiculo();
        modelo.setConsumoDiesel(consumoEsperado);
        assertEquals(consumoEsperado, modelo.getConsumoDiesel(), 0.01);
    }
}
