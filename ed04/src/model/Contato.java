package model;

/**
 * Interface que define os métodos públicos obrigatórios para um contato.
 */
public interface Contato {
    /**
     * Retorna o nome do contato.
     * @return O nome do contato.
     */
    String getNome();

    /**
     * Retorna o telefone do contato.
     * @return O telefone do contato.
     */
    String getTelefone();

    /**
     * Retorna o email do contato.
     * @return O email do contato.
     */
    String getEmail();

    /**
     * Define o nome do contato.
     * @param nome O nome a ser definido.
     */
    void setNome(String nome);

    /**
     * Define o telefone do contato.
     * @param telefone O telefone a ser definido.
     */
    void setTelefone(String telefone);

    /**
     * Define o email do contato.
     * @param email O email a ser definido.
     */
    void setEmail(String email);

    /**
     * Retorna uma representação formatada das informações do contato.
     * @return Uma string com as informações do contato.
     */
    String exibirInformacoes();
}