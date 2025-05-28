/**
 * Classe abstrata representando um usuário do sistema.
 */
public abstract class Usuario {
    protected String login;
    protected String senha;

    /**
     * Construtor para inicializar login e senha.
     * @param login nome de login do usuário
     * @param senha senha do usuário
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o login do usuário.
     */
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
}
