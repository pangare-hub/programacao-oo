/**
 * Interface para gerenciamento de usuários.
 */
public interface Gerenciavel {
    /**
     * Altera a senha do usuário.
     * @param novaSenha nova senha a ser definida
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o usuário.
     */
    void bloquearUsuario();
}
