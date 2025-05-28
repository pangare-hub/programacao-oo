/**
 * Classe que representa um visitante do sistema.
 */
public class Visitante extends Usuario {

    /**
     * Construtor da classe Visitante.
     * @param login nome de login
     * @param senha senha (qualquer)
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
