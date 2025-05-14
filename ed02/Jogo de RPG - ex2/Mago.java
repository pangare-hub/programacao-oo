/**
 * Classe que representa um mago no jogo, herda de Personagem.
 * O mago realiza ataques mágicos, mas possui uma defesa mais fraca.
 */
public class Mago extends Personagem {

    /**
     * Construtor da classe Mago.
     * 
     * @param nome Nome do mago.
     */
    public Mago(String nome) {
        super(nome, 80, 25);
    }

    /**
     * Método que define o comportamento de ataque do mago.
     * O mago lança um feitiço mágico no inimigo.
     * 
     * @param inimigo O personagem inimigo a ser atacado.
     */
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança um feitiço em " + inimigo.nome + "!");
        inimigo.defender(ataqueBase);
    }

    /**
     * Habilidade especial do mago: Bola de Fogo, que causa um dano mágico ao inimigo.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " conjura Bola de Fogo!");
    }

    /**
     * Método que define o comportamento de defesa do mago.
     * O mago não possui redução de dano.
     * 
     * @param dano O dano que o mago recebe.
     */
    @Override
    public void defender(int dano) {
        super.defender(dano);
    }
}
