public abstract class Pessoa implements Resumivel{

    private String nomeCompleto;
    private String dataNascimento;
    private String email;

    public Pessoa(String nomeCompleto, String dataNascimento, String email) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void apresentarResumo() {
        System.out.println("Resumo do paciente.");
    }
}
