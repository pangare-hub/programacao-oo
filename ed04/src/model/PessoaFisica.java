package model;

/**
 * Classe que representa um contato do tipo Pessoa Física.
 */
public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
     * Construtor da classe PessoaFisica.
     * @param nome O nome da pessoa física.
     * @param telefone O telefone da pessoa física.
     * @param email O email da pessoa física.
     * @param cpf O CPF da pessoa física.
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    /**
     * Retorna o CPF da pessoa física.
     * @return O CPF da pessoa física.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física.
     * @param cpf O CPF a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("| %-20s | %-15s | %-25s | CPF: %-14s |", getNome(), getTelefone(), getEmail(), cpf);
    }
}