public class Voluntario extends Pessoa implements Autenticavel, AcionadorEmergencia {
    public Voluntario(String nomeCompleto, String dataNascimento, String email) {
        super(nomeCompleto, dataNascimento, email);
    }

    @Override
    public void apresentarResumo() {
        System.out.println("Resumo do voluntário.");
    }

    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public void acionarEmergencia() {
        System.out.println("Protocolo de emergência acionado pelo voluntário.");
    }

}
