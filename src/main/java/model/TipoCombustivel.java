package model;

public class TipoCombustivel {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCombustivel(){

    }

    public TipoCombustivel(String nome) {
        this.nome = nome;
    }
}
