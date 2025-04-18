import java.util.Random;
/** Gerencia a lógica e a formação do jogo */
public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas();

        if (tentativa < numeroSecreto) {
            return "O número é maior.";
        } else if (tentativa > numeroSecreto) {
            return "O número é menor.";
        } else {
            int pontuacao = 100 - jogador.getTentativas() * 10;
            if (pontuacao < 0) pontuacao = 0;
            jogador.atualizarPontuacao(pontuacao);
            return "Parabéns! Você acertou.";
        }
    }
}
