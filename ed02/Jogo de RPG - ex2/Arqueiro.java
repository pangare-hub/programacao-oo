import java.util.Random;

/**
 * Classe que representa um arqueiro no jogo, herda de Personagem.
 * O arqueiro tem ataque médio e pode realizar ataques críticos.
 */
public class Arqueiro extends Personagem {
    private Random random = new Random();

    /**
     * Construtor da classe Arqueiro.
     * 
     * @param nome Nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome, 100, 15);
    }

    /**
     * Método que define o comportamento de ataque do arqueiro.
     * O arqueiro realiza um ataque físico com chance de ser crítico.
     * 
     * @param inimigo O personagem inimigo a ser atacado.
     */
    @Override
    public void atacar(Personagem inimigo) {
            boolean critico = random.nextDouble() < 0.3;
        int dano = critico ? ataqueBase * 2 : ataqueBase;
                System.out.println(nome + (critico ? " acerta um CRÍTICO em " : " ataca ") + inimigo.nome + "!");
        inimigo.defender(dano);
    }

    /**
     * Habilidade especial do arqueiro: Chuva de Flechas, que realiza três ataques consecutivos.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 0; i < 3; i++) {
            System.out.println("Flecha " + (i + 1) + " lançada! (Dano: " + ataqueBase + ")");
        }
    }
}
