package view;

import controller.ControllerUsuario;
import model.BombaCombustivel;
import model.ModeloVeiculo;
import model.TipoCombustivel;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InterfaceUsuarioTest {

    private InterfaceUsuario interfaceUsuario;
    private ControllerUsuario mockControllerUsuario;

    @Before
    public void setUp() {
        mockControllerUsuario = mock(ControllerUsuario.class);
        interfaceUsuario = new InterfaceUsuario();
        interfaceUsuario.controllerUsuario = mockControllerUsuario;
    }

    @Test
    public void testIncluirNovoModeloVeiculo() {
        String input = "Modelo Teste\n10\n15\n20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        interfaceUsuario.incluirNovoModeloVeiculo();

        ModeloVeiculo expectedModeloVeiculo = new ModeloVeiculo("Modelo Teste", 10, 15, 20);
        verify(mockControllerUsuario).incluirNovoModeloVeiculo(expectedModeloVeiculo);
    }

    @Test
    public void testIncluirNovoTipoCombustivel() {
        String input = "Diesel\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        interfaceUsuario.incluirNovoTipoCombustivel();

        TipoCombustivel expectedTipoCombustivel = new TipoCombustivel("Diesel");
        verify(mockControllerUsuario).incluirNovoTipoCombustivel(expectedTipoCombustivel);
    }

    @Test
    public void testIncluirNovaBombaCombustivel() {
        String input = "Bomba123\nGasolina\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        interfaceUsuario.incluirNovaBombaCombustivel();

        BombaCombustivel expectedBombaCombustivel = new BombaCombustivel("Bomba123", new TipoCombustivel("Gasolina"));
        verify(mockControllerUsuario).incluirNovaBombaCombustivel(expectedBombaCombustivel);
    }

    @Test
    public void testMudarCriterioEnfileiramento() {
        String input = "NovoCriterio\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        interfaceUsuario.mudarCriterioEnfileiramento();

        verify(mockControllerUsuario).mudarCriterioEnfileiramento("NovoCriterio");
    }


}
