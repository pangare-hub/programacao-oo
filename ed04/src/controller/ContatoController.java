package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Contato;
import model.PessoaFisica;
import model.PessoaJuridica;

/**
 * Classe que orquestra a lógica da aplicação, manipulando a lista de contatos.
 */
public class ContatoController {
    private List<Contato> contatos;

    /**
     * Construtor da classe ContatoController.
     */
    public ContatoController() {
        this.contatos = new ArrayList<>();
    }

    /**
     * Adiciona um novo contato à lista.
     * @param contato O objeto Contato a ser adicionado.
     * @return true se o contato foi adicionado com sucesso, false caso contrário.
     */
    public boolean adicionarContato(Contato contato) {
        if (!validarNome(contato.getNome())) {
            return false;
        }

        if (contato instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) contato;
            if (!validarCpf(pf.getCpf())) {
                return false;
            }
            if (buscarContatoPorCpf(pf.getCpf()) != null) {
                System.out.println("Erro: Já existe um contato com este CPF.");
                return false;
            }
        } else if (contato instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) contato;
            if (!validarCnpj(pj.getCnpj())) {
                return false;
            }
            if (buscarContatoPorCnpj(pj.getCnpj()) != null) {
                System.out.println("Erro: Já existe um contato com este CNPJ.");
                return false;
            }
        }
        contatos.add(contato);
        return true;
    }

    /**
     * Valida se o nome é obrigatório e possui no mínimo 3 caracteres.
     * @param nome O nome a ser validado.
     * @return true se o nome é válido, false caso contrário.
     */
    private boolean validarNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            System.out.println("Erro: O nome é obrigatório e deve ter no mínimo 3 caracteres.");
            return false;
        }
        return true;
    }

    /**
     * Valida se o CPF contém 11 dígitos numéricos.
     * @param cpf O CPF a ser validado.
     * @return true se o CPF é válido, false caso contrário.
     */
    private boolean validarCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            System.out.println("Erro: CPF inválido. Deve conter 11 dígitos numéricos.");
            return false;
        }
        return true;
    }

    /**
     * Valida se o CNPJ contém 14 dígitos numéricos.
     * @param cnpj O CNPJ a ser validado.
     * @return true se o CNPJ é válido, false caso contrário.
     */
    private boolean validarCnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            System.out.println("Erro: CNPJ inválido. Deve conter 14 dígitos numéricos.");
            return false;
        }
        return true;
    }

    /**
     * Busca um contato pelo CPF.
     * @param cpf O CPF a ser buscado.
     * @return O objeto PessoaFisica se encontrado, null caso contrário.
     */
    public PessoaFisica buscarContatoPorCpf(String cpf) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contato;
                if (pf.getCpf().equals(cpf)) {
                    return pf;
                }
            }
        }
        return null;
    }

    /**
     * Busca um contato pelo CNPJ.
     * @param cnpj O CNPJ a ser buscado.
     * @return O objeto PessoaJuridica se encontrado, null caso contrário.
     */
    public PessoaJuridica buscarContatoPorCnpj(String cnpj) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contato;
                if (pj.getCnpj().equals(cnpj)) {
                    return pj;
                }
            }
        }
        return null;
    }

    /**
     * Retorna a lista completa de contatos.
     * @return Uma lista de objetos Contato.
     */
    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos); // Retorna uma cópia para evitar modificações externas
    }

    /**
     * Busca contatos por nome (case-insensitive).
     * @param nome O nome a ser buscado.
     * @return Uma lista de contatos que contêm o nome.
     */
    public List<Contato> buscarContatosPorNome(String nome) {
        List<Contato> contatosEncontrados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase().contains(nome.toLowerCase())) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    /**
     * Atualiza um contato existente.
     * @param contatoAntigo O contato a ser atualizado.
     * @param campo O campo a ser atualizado (nome, telefone, email).
     * @param novoValor O novo valor para o campo.
     * @return true se a atualização foi bem-sucedida, false caso contrário.
     */
    public boolean atualizarContato(Contato contatoAntigo, int campo, String novoValor) {
        if (contatoAntigo == null) {
            return false;
        }

        switch (campo) {
            case 1: // Nome
                if (!validarNome(novoValor)) {
                    return false;
                }
                contatoAntigo.setNome(novoValor);
                break;
            case 2: // Telefone
                contatoAntigo.setTelefone(novoValor);
                break;
            case 3: // Email
                contatoAntigo.setEmail(novoValor);
                break;
            default:
                System.out.println("Opção de campo inválida.");
                return false;
        }
        return true;
    }

    /**
     * Exclui um contato da lista.
     * @param contato O contato a ser excluído.
     * @return true se o contato foi removido com sucesso, false caso contrário.
     */
    public boolean excluirContato(Contato contato) {
        return contatos.remove(contato);
    }
}