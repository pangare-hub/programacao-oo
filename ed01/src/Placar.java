import java.util.ArrayList;
/** Respónsavel pela pontuação do jogo*/
public class Placar {
    private ArrayList<Jogador> ranking;

    public Placar() {
        ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }

    public void mostrarRanking() {
        System.out.println("\n🏆 Ranking:");
        for (Jogador j : ranking) {
            System.out.println(j.getNome() + " - Pontuação: " + j.getPontuacao());
        }
    }
}
