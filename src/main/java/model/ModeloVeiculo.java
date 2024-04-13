package model;

public class ModeloVeiculo {
    private String nome;
    private double consumoEtanol;
    private double consumoGasolina;
    private double consumoDiesel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
