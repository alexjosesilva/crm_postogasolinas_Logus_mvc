package controller;

import model.TipoCombustivel;
import model.ModeloVeiculo;
import model.BombaCombustivel;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa um controller da Aplicação
 * Aqui o desenvolvedor poderá controlar todas as funcionalidades
 * do projeto como:
 * + Adicionar modelo Veiuclos
 * + Adicionar Bomba Combustivel
 * + Adicionar Tipo de Combustivel
 * + Atlerar tipo de criterioEnfileiramento
 * *
 */
public class ControllerUsuario {
    private List<TipoCombustivel> tiposCombustivel;
    private List<ModeloVeiculo> modelosVeiculo;
    private List<BombaCombustivel> bombasCombustivel;
    private String criterioEnfileiramento;
    public ControllerUsuario() {
        this.tiposCombustivel = new ArrayList<>();
        this.modelosVeiculo = new ArrayList<>();
        this.bombasCombustivel = new ArrayList<>();
        this.criterioEnfileiramento = "FIFO";
    }

    /**
     * Este Metodo Incluir novo tipo e Combustivel.
     */
    public void incluirNovoTipoCombustivel(TipoCombustivel tipoCombustivel) {
        tiposCombustivel.add(tipoCombustivel);
    }

    /**
     * Este Metodo Incluir novo Modelo de Veiculo.
     */
    public void incluirNovoModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        modelosVeiculo.add(modeloVeiculo);
    }

    /**
     * Este Metodo Incluir nova Bomba Combustivel
     */
    public void incluirNovaBombaCombustivel(BombaCombustivel bombaCombustivel) {
        bombasCombustivel.add(bombaCombustivel);
    }

    /**
     * Este Metodo mudar criterio de Enfileiramento
     */
    public void mudarCriterioEnfileiramento() {
        // Implemente aqui a lógica para mudar o critério de enfileiramento
    }

    /**
     * Este Metodo Exibi todos os Modelos
     */
    public void exibirTodosModelos() {
        System.out.println("===== Modelos de Veículo =====");
        for (ModeloVeiculo modelo : modelosVeiculo) {
            System.out.println(modelo.getNomeModelo());
        }
        System.out.println("===============================");
    }

    /**
     * Este Metodo Exibi todos os Combustiveis
     */
    public void exibirTodosCombustiveis() {
        System.out.println("===== Tipos de Combustiveis =====");
        for (TipoCombustivel tipo : tiposCombustivel) {
            System.out.println(tipo.getNome());
        }
        System.out.println("===============================");
    }

    /**
     * Este Metodo Exibi todos as Bombas
     */
    public void exibirTodasBombas() {
        System.out.println("===== Tipos as Bombas =====");
        for (BombaCombustivel tipo : bombasCombustivel) {
            System.out.println(tipo.getIdentificadorBomba());
        }
        System.out.println("===============================");
    }

    /**
     * Este Metodo Altera Criterio de Enfileiramento
     */
    public void mudarCriterioEnfileiramento(String criterio) {
        criterioEnfileiramento = criterio;
    }

    /**
     * Este Metodo Exibi Criterio de Enfileiramento
     */
    public String getCriterioEnfileiramento() {
        return criterioEnfileiramento;
    }
}
