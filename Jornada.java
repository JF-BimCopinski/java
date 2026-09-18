import java.util.ArrayList;

public class Jornada {

    private ArrayList<Meta> metas;

    public Jornada() {
        metas = new ArrayList<>();
    }

    public void adicionarMeta(String descricao) {
        metas.add(new Meta(descricao));
    }

    public void concluirMeta(int indice) {
        metas.get(indice).concluir();
    }

    public void mostrarMetas() {

        System.out.println("\n--- MINHA JORNADA ---");

        for (int i = 0; i < metas.size(); i++) {

            Meta meta = metas.get(i);

            if (meta.isConcluida()) {
                System.out.println("✓ " + meta.getDescricao());
            } else {
                System.out.println("○ " + meta.getDescricao());
            }
        }
    }
}
