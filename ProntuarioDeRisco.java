public class ProntuarioDeRisco {
    private String descricao;
    private int nivelRisco;

    public ProntuarioDeRisco(String descricao, int nivelRisco) {
        this.descricao = descricao;
        this.nivelRisco = nivelRisco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }


}
