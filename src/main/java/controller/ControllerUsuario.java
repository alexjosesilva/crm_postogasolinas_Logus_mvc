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

    public ControllerUsuario() {
        this.tiposCombustivel = new ArrayList<>();
        this.modelosVeiculo = new ArrayList<>();
        this.bombasCombustivel = new ArrayList<>();
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

}
