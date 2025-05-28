/**
 * Classe que representa um cliente do sistema.
 */
public class Cliente extends Usuario implements Autenticavel {

    /**
     * Construtor da classe Cliente.
     * @param login nome de login
     * @param senha senha do cliente
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}
