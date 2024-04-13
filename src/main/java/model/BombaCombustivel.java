package model;

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
