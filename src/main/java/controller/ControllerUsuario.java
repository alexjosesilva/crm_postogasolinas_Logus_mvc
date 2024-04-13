package controller;

import model.TipoCombustivel;
import model.ModeloVeiculo;
import model.BombaCombustivel;

import java.util.ArrayList;
import java.util.List;

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

    public void incluirNovoTipoCombustivel(TipoCombustivel tipoCombustivel) {
        tiposCombustivel.add(tipoCombustivel);
    }

    public void incluirNovoModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        modelosVeiculo.add(modeloVeiculo);
    }

    public void incluirNovaBombaCombustivel(BombaCombustivel bombaCombustivel) {
        bombasCombustivel.add(bombaCombustivel);
    }

    public void mudarCriterioEnfileiramento() {
        // Implemente aqui a lógica para mudar o critério de enfileiramento
    }

    // Outros métodos necessários para operações adicionais
    public void exibirTodosModelos() {
        System.out.println("===== Modelos de Veículo =====");
        for (ModeloVeiculo modelo : modelosVeiculo) {
            System.out.println(modelo.getNomeModelo());
        }
        System.out.println("===============================");
    }

    public void exibirTodosCombustiveis() {
        System.out.println("===== Tipos de Combustiveis =====");
        for (TipoCombustivel tipo : tiposCombustivel) {
            System.out.println(tipo.getNome());
        }
        System.out.println("===============================");
    }

    public void exibirTodasBombas() {
        System.out.println("===== Tipos as Bombas =====");
        for (BombaCombustivel tipo : bombasCombustivel) {
            System.out.println(tipo.getIdentificadorBomba());
        }
        System.out.println("===============================");
    }

    public void mudarCriterioEnfileiramento(String criterio) {
        criterioEnfileiramento = criterio;
    }

    public String getCriterioEnfileiramento() {
        return criterioEnfileiramento;
    }
}
