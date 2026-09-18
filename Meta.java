public class Meta {

    private String descricao;
    private boolean concluida;

    public Meta(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        concluida = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
