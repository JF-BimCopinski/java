public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(
                "Jean Felipe Bim Copinski",
                "10/09/2004",
                "JJ@gmail.com",
                "JJ",
                "Baixo"
        );

        Voluntario voluntario = new Voluntario(
                "Lucas H. Spinassi",
                "00/11/2001",
                "email@gmail.com"
        );

        Psicologo psicologo = new Psicologo(
                "Lucas H. Spinassi",
                "00/11/2001",
                "email@gmail.com",
                "123"
        );

        Atendimento atendimento = new Atendimento(paciente, voluntario);

        RedeDeApoio rede = new RedeDeApoio("Rede de Apoio");

        rede.adicionarPaciente(paciente);

        paciente.apresentarResumo();

        voluntario.apresentarResumo();
        voluntario.autenticar();
        voluntario.acionarEmergencia();

        psicologo.apresentarResumo();
        psicologo.autenticar();
        psicologo.acionarEmergencia();

        System.out.println("Paciente da rede: " + rede.getPacientes().size());

        System.out.println("Atendimento criado.");
        System.out.println("Prontuário criado: " +
                (atendimento.getProntuarioDeRisco() != null));
    }
}
