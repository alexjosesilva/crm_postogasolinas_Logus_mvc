package controller;

import model.TipoCombustivel;
import model.ModeloVeiculo;
import model.BombaCombustivel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

    public String filePath = "src/main/resources/csv/";

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
        salvarTipoCombustivelCSV(tipoCombustivel);
    }

    /**
     * Metodo para retornar tipo de combustivel
     */
    public List<TipoCombustivel> getTiposCombustivel(){
        return tiposCombustivel;
    }


    /**
     * Este Metodo Incluir novo Modelo de Veiculo.
     */
    public void incluirNovoModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        modelosVeiculo.add(modeloVeiculo);
        salvarModelosVeiculoCSV(modeloVeiculo);
    }

    /**
     * Metodo para retornar Modelo de veiculo
     */
    public List<ModeloVeiculo> getModelosVeiculo(){
        return modelosVeiculo;
    }
    /**
     * Este Metodo Incluir nova Bomba Combustivel
     */
    public void incluirNovaBombaCombustivel(BombaCombustivel bombaCombustivel) {
        bombasCombustivel.add(bombaCombustivel);
    }

    /**
     * Metodo para retornar Bomba Combustivel
     */
    public List<BombaCombustivel> getBombasCombustivel(){
        return bombasCombustivel;
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

    private void salvarModelosVeiculoCSV(ModeloVeiculo modeloVeiculo) {
        try {
            FileWriter writer = new FileWriter(filePath+"/modelos_veiculo.csv");
            // Escreve os cabeçalhos do arquivo CSV
            writer.append("Nome,ConsumoEtanol,ConsumoGasolina,ConsumoDiesel\n");

            // Escreve os dados de cada modelo de veículo na lista
            for (ModeloVeiculo modelo : modelosVeiculo) {
                writer.append(modelo.getNomeModelo());
                writer.append(",");
                writer.append(String.valueOf(modelo.getConsumoEtanol()));
                writer.append(",");
                writer.append(String.valueOf(modelo.getConsumoGasolina()));
                writer.append(",");
                writer.append(String.valueOf(modelo.getConsumoDiesel()));
                writer.append("\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exibirModelosVeiculoCSV() {
        try {
            // Cria um BufferedReader para ler o arquivo CSV
            BufferedReader reader = new BufferedReader(new FileReader(filePath+"modelos_veiculo.csv"));

            // Lê a primeira linha do arquivo (cabeçalho)
            String line = reader.readLine();

            // Exibe o cabeçalho
            System.out.println("===== Modelos de Veículo =====");
            System.out.println(line);

            // Lê e exibe as linhas restantes do arquivo (dados dos modelos de veículo)
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvarTipoCombustivelCSV(TipoCombustivel tipoCombustivel) {
        try {
            FileWriter writer = new FileWriter(filePath+"/tipo_combutivel.csv");
            // Escreve os cabeçalhos do arquivo CSV
            writer.append("Tipo\n");

            // Escreve os dados de cada modelo de combustivel na lista
            for (TipoCombustivel tipo : tiposCombustivel) {
                writer.append(tipo.getNome());
                writer.append("\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exibirTiposCombustiveisCSV() {
        try {
            // Cria um BufferedReader para ler o arquivo CSV
            BufferedReader reader = new BufferedReader(new FileReader(filePath+"tipo_combutivel.csv"));

            // Lê a primeira linha do arquivo (cabeçalho)
            String line = reader.readLine();

            // Exibe o cabeçalho
            System.out.println("===== Tipos de Combustivel =====");
            System.out.println(line);

            // Lê e exibe as linhas restantes do arquivo (dados dos modelos de veículo)
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
