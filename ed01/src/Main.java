import java.util.Scanner;
/** Classe e menu principal do jogo */
public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Placar placar = new Placar();
            
            System.out.println("🎮 Bem-vindo ao Jogo de Adivinhação!");
            
            boolean continuar = true;
            
            while (continuar) {
                System.out.print("\nDigite seu nome: ");
                String nome = teclado.nextLine();
                Jogador jogador = new Jogador(nome);
                
                Jogo jogo = new Jogo(jogador);
                boolean acertou = false;
                
                while (!acertou) {
                    System.out.print("Digite um número entre 1 e 100: ");
                    int tentativa = teclado.nextInt();
                    teclado.nextLine();
                    
                    String resultado = jogo.jogar(tentativa);
                    System.out.println(resultado);
                    
                    if (resultado.equals("Parabéns! Você acertou.")) {
                        acertou = true;
                        System.out.println("Tentativas: " + jogador.getTentativas());
                        System.out.println("Pontuação final: " + jogador.getPontuacao());
                    }
                }
                
                placar.adicionarJogador(jogador);
                
                System.out.print("Deseja jogar novamente? (s/n): ");
                String resposta = teclado.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            }
            
            System.out.println("\n=== Fim do jogo ===");
            placar.mostrarRanking();
        }
    }
}
