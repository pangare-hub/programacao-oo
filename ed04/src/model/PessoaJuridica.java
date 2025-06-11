package model;

/**
 * Classe que representa um contato do tipo Pessoa Jurídica.
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
     * Construtor da classe PessoaJuridica.
     * @param nome O nome da pessoa jurídica.
     * @param telefone O telefone da pessoa jurídica.
     * @param email O email da pessoa jurídica.
     * @param cnpj O CNPJ da pessoa jurídica.
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    /**
     * Retorna o CNPJ da pessoa jurídica.
     * @return O CNPJ da pessoa jurídica.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da pessoa jurídica.
     * @param cnpj O CNPJ a ser definido.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("| %-20s | %-15s | %-25s | CNPJ: %-17s |", getNome(), getTelefone(), getEmail(), cnpj);
    }
}