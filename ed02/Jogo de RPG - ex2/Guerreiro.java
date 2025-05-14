/**
 * Classe que representa um guerreiro no jogo, herda de Personagem.
 * O guerreiro tem ataque forte e reduz metade do dano recebido.
 */
public class Guerreiro extends Personagem {

    /**
     * Construtor da classe Guerreiro.
     * 
     * @param nome Nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }

    /**
     * Método que define o comportamento de ataque do guerreiro.
     * O guerreiro realiza um ataque físico básico no inimigo.
     * 
     * @param inimigo O personagem inimigo a ser atacado.
     */
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.nome + " com espada!");
        inimigo.defender(ataqueBase);
    }

    /**
     * Método que define o comportamento de defesa do guerreiro.
     * O guerreiro reduz o dano recebido pela metade.
     * 
     * @param dano O dano que o guerreiro recebe.
     */
    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
         super.defender(danoReduzido);
    }

    /**
     * Habilidade especial do guerreiro: Golpe Duplo, que causa o dobro do ataque base em dois ataques seguidos.
     */
    @Override
    public void usarHabilidadeEspecial() {
            System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
            System.out.println(nome + " realiza um ataque de " + ataqueBase + " de dano!");
        ataqueBase /= 2; // Volta ao normal após o golpe especial
    }
}
