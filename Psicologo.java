public class Psicologo extends Pessoa implements Autenticavel, AcionadorEmergencia{
    private String crp;

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public Psicologo(String nomeCompleto, String dataNascimento, String email, String crp) {
        super(nomeCompleto, dataNascimento, email);
        this.crp = crp;
    }

    @Override
    public void apresentarResumo() {
        System.out.println("CRP:" +crp);
    }

    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public void acionarEmergencia() {
        System.out.println("Protocolo de emergência acionado pelo psicólogo.");
    }
}
