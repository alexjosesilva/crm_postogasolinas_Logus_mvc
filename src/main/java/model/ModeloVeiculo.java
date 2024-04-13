package model;

/**
 * Essa Classe é modelo para ModeloVeiculo
 * Esta apta a ser utilizada para persistir em dados
 * quando necessário
 * Adicionar o serialaiser para persistir.
 *
 */
public class ModeloVeiculo {
    private String nomeModelo;
    private double consumoEtanol;
    private double consumoGasolina;
    private double consumoDiesel;

    public ModeloVeiculo(String nomeModelo, double consumoEtanol, double consumoGasolina, double consumoDiesel) {
        this.nomeModelo = nomeModelo;
        this.consumoEtanol = consumoEtanol;
        this.consumoGasolina = consumoGasolina;
        this.consumoDiesel = consumoDiesel;
    }
    public ModeloVeiculo(){

    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getConsumoEtanol() {
        return consumoEtanol;
    }

    public void setConsumoEtanol(double consumoEtanol) {
        this.consumoEtanol = consumoEtanol;
    }

    public double getConsumoGasolina() {
        return consumoGasolina;
    }

    public void setConsumoGasolina(double consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    public double getConsumoDiesel() {
        return consumoDiesel;
    }

    public void setConsumoDiesel(double consumoDiesel) {
        this.consumoDiesel = consumoDiesel;
    }
}
