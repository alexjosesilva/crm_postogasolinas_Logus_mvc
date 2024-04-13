package model;

/**
 * Essa Classe é modelo para TipoCombustivel
 * Esta apta a ser utilizada para persistir em dados
 * quando necessário
 * Adicionar o serialaiser para persistir.
 *
 */
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
