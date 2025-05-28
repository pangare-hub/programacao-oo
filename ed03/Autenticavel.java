/**
 * Interface para autenticação de usuários.
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida.
     * @param senha senha a ser verificada
     * @return true se a senha for válida, false caso contrário
     */
    boolean autenticar(String senha);
}
