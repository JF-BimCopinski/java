public class Paciente extends Pessoa{
    private String apelido;
    private String nivelDeUrgencia;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNivelDeUrgencia() {
        return nivelDeUrgencia;
    }

    public void setNivelDeUrgencia(String nivelDeUrgencia) {
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    public Paciente(String nomeCompleto, String dataNascimento, String email, String apelido, String nivelDeUrgencia) {
        super(nomeCompleto, dataNascimento, email);
        this.apelido = apelido;
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    @Override
    public void apresentarResumo() {
        System.out.println("Apelido: "+apelido);
        System.out.println("Nível de urgência: "+nivelDeUrgencia);
    }
}
