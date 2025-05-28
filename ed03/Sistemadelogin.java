
package sistemadelogin;

/**
 * Interface que define o comportamento de autenticação.
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida.
     * 
     * @param senha A senha fornecida pelo usuário.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    boolean autenticar(String senha);
}
/**
 * Interface que define operações administrativas sobre o usuário.
 */
public interface Gerenciavel {
    /**
     * Altera a senha do usuário.
     * 
     * @param novaSenha A nova senha a ser definida.
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o usuário.
     */
    void bloquearUsuario();
}
/**
 * Interface que define o comportamento de registro de log.
 */
public interface Logavel {
    /**
     * Registra uma operação no log.
     * 
     * @param operacao A operação realizada.
     */
    void registrarLog(String operacao);
}
/**
 * Classe abstrata que representa um usuário do sistema.
 */
public abstract class Usuario {
    protected String login;
    protected String senha;

    /**
     * Construtor da classe Usuario.
     * 
     * @param login Login do usuário.
     * @param senha Senha do usuário.
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
/**
 * Representa um usuário administrador com privilégios especiais.
 */
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {

    /**
     * Construtor da classe Administrador.
     * 
     * @param login Login do administrador.
     * @param senha Senha do administrador.
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}
/**
 * Representa um visitante com acesso restrito ao sistema.
 */
public class Visitante extends Usuario {

    /**
     * Construtor da classe Visitante.
     * 
     * @param login Login do visitante.
     * @param senha Senha (qualquer) do visitante.
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
/**
 * Representa um cliente do sistema com autenticação simples.
 */
public class Cliente extends Usuario implements Autenticavel {

    /**
     * Construtor da classe Cliente.
     * 
     * @param login Login do cliente.
     * @param senha Senha do cliente.
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}
/**
 * Classe principal para testar o sistema de login.
 */
public class ProgramaLogin {

    /**
     * Método principal que cria e testa os usuários do sistema.
     * 
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Administrador admin = new Administrador("admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo123");

        // Administrador
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        System.out.println();

        // Visitante
        visitante.exibirLogin();
        System.out.println();

        // Cliente
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
}

