package model;

/**
 * Essa Classe é modelo para BombaCombustivel
 * Esta apta a ser utilizada para persistir em dados
 * quando necessário
 * Adicionar o serialaiser para persistir.
 *
 */
public class BombaCombustivel {
    private TipoCombustivel tipoCombustivel;
    private String IdentificadorBomba;

    public String getIdentificadorBomba() {
        return IdentificadorBomba;
    }

    public void setIdentificadorBomba(String identificadorBomba) {
        IdentificadorBomba = IdentificadorBomba;
    }

    public BombaCombustivel(String IdentificadorBomba,  TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.IdentificadorBomba = IdentificadorBomba;
    }

    // Métodos getters e setters
    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
