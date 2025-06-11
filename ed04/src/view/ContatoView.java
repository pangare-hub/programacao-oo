package view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Contato;
import model.PessoaFisica;
import model.PessoaJuridica;

/**
 * Classe responsável pela entrada e exibição de dados no console.
 */
public class ContatoView {
    private Scanner scanner;

    /**
     * Construtor da classe ContatoView.
     */
    public ContatoView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Exibe o menu principal da aplicação e solicita a opção do usuário.
     * @return A opção escolhida pelo usuário.
     */
    public int exibirMenu() {
        System.out.println("\n--- Agenda de Contatos ---");
        System.out.println("1. Cadastrar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Atualizar Contato");
        System.out.println("4. Excluir Contato");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.next(); // Limpa o buffer do scanner
            return -1; // Retorna um valor inválido para continuar o loop
        }
    }

    /**
     * Solicita ao usuário o tipo de contato a ser cadastrado.
     * @return O tipo de contato escolhido (1 para Pessoa Física, 2 para Pessoa Jurídica).
     */
    public int solicitarTipoContato() {
        System.out.println("\n--- Tipo de Contato ---");
        System.out.println("1. Pessoa Física");
        System.out.println("2. Pessoa Jurídica");
        System.out.print("Escolha o tipo de contato: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.next();
            return -1;
        } finally {
            scanner.nextLine(); // Consome a quebra de linha pendente
        }
    }

    /**
     * Solicita os dados básicos de um contato ao usuário.
     * @return Um array de Strings contendo nome, telefone e email.
     */
    public String[] solicitarDadosBasicosContato() {
        String[] dados = new String[3];
        System.out.print("Nome: ");
        dados[0] = scanner.nextLine();
        System.out.print("Telefone: ");
        dados[1] = scanner.nextLine();
        System.out.print("Email: ");
        dados[2] = scanner.nextLine();
        return dados;
    }

    /**
     * Solicita o CPF da Pessoa Física.
     * @return O CPF digitado pelo usuário.
     */
    public String solicitarCpf() {
        System.out.print("CPF (11 dígitos numéricos): ");
        return scanner.nextLine();
    }

    /**
     * Solicita o CNPJ da Pessoa Jurídica.
     * @return O CNPJ digitado pelo usuário.
     */
    public String solicitarCnpj() {
        System.out.print("CNPJ (14 dígitos numéricos): ");
        return scanner.nextLine();
    }

    /**
     * Exibe uma mensagem de sucesso ou erro.
     * @param mensagem A mensagem a ser exibida.
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Exibe a lista de contatos em formato tabular.
     * @param contatos A lista de contatos a ser exibida.
     */
    public void exibirContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\n--- Lista de Contatos ---");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| Nome                 | Telefone        | Email                     | Documento             |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contato;
                System.out.println(pf.exibirInformacoes());
            } else if (contato instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contato;
                System.out.println(pj.exibirInformacoes());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    /**
     * Solicita ao usuário o nome do contato a ser buscado para atualização ou exclusão.
     * @return O nome do contato.
     */
    public String solicitarNomeBusca() {
        System.out.print("Digite o nome do contato: ");
        return scanner.nextLine();
    }

    /**
     * Solicita ao usuário qual informação do contato deseja atualizar.
     * @return A opção de atualização escolhida.
     */
    public int solicitarOpcaoAtualizacao() {
        System.out.println("\n--- O que deseja atualizar? ---");
        System.out.println("1. Nome");
        System.out.println("2. Telefone");
        System.out.println("3. Email");
        System.out.print("Escolha uma opção: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.next();
            return -1;
        } finally {
            scanner.nextLine();
        }
    }

    /**
     * Solicita o novo valor para o campo a ser atualizado.
     * @param campo O nome do campo que está sendo atualizado.
     * @return O novo valor.
     */
    public String solicitarNovoValor(String campo) {
        System.out.print("Digite o novo " + campo + ": ");
        return scanner.nextLine();
    }
}