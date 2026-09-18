public class Atendimento {
    private Paciente paciente;
    private Pessoa responsavel;
    private ProntuarioDeRisco prontuarioDeRisco;

    public Atendimento(Paciente paciente, Pessoa responsavel) {
        this.paciente = paciente;
        this.responsavel = responsavel;
        this.prontuarioDeRisco = new ProntuarioDeRisco("", 0);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public ProntuarioDeRisco getProntuarioDeRisco() {
        return prontuarioDeRisco;
    }
}
