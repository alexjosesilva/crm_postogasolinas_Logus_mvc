package controller;

import model.BombaCombustivel;
import model.ModeloVeiculo;
import model.TipoCombustivel;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ControllerUsuarioTest {

    private ControllerUsuario controller;

    @Before
    public void setUp() {
        controller = new ControllerUsuario();
    }

    @Test
    public void testIncluirNovoTipoCombustivel() {
        TipoCombustivel tipo = new TipoCombustivel("Gasolina");
        controller.incluirNovoTipoCombustivel(tipo);
        List<TipoCombustivel> tipos = controller.getTiposCombustivel();
        assertTrue(tipos.contains(tipo));
    }

    @Test
    public void testIncluirNovoModeloVeiculo() {
        ModeloVeiculo modelo = new ModeloVeiculo("Fiesta", 8.5, 12.5, 10.0);
        controller.incluirNovoModeloVeiculo(modelo);
        List<ModeloVeiculo> modelos = controller.getModelosVeiculo();
        assertTrue(modelos.contains(modelo));
    }

    @Test
    public void testIncluirNovaBombaCombustivel() {
        TipoCombustivel tipo = new TipoCombustivel("Etanol");
        BombaCombustivel bomba = new BombaCombustivel("B001", tipo);
        controller.incluirNovaBombaCombustivel(bomba);
        List<BombaCombustivel> bombas = controller.getBombasCombustivel();
        assertTrue(bombas.contains(bomba));
    }

    @Test
    public void testMudarCriterioEnfileiramento() {
        String criterioEsperado = "LIFO";
        controller.mudarCriterioEnfileiramento(criterioEsperado);
        assertEquals(criterioEsperado, controller.getCriterioEnfileiramento());
    }
}
