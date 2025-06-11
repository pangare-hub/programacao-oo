import controller.ContatoController;
import java.util.List;
import model.Contato;
import model.PessoaFisica;
import model.PessoaJuridica;
import view.ContatoView;

/**
 * Classe principal que inicia a aplicação da Agenda de Contatos.
 */
public class App {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();
        int opcao;

        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1: // Cadastrar Contato
                    int tipoContato = view.solicitarTipoContato();
                    String[] dadosBasicos = view.solicitarDadosBasicosContato();
                    String nome = dadosBasicos[0];
                    String telefone = dadosBasicos[1];
                    String email = dadosBasicos[2];

                    if (tipoContato == 1) { // Pessoa Física
                        String cpf = view.solicitarCpf();
                        PessoaFisica pf = new PessoaFisica(nome, telefone, email, cpf);
                        if (controller.adicionarContato(pf)) {
                            view.exibirMensagem("Pessoa Física cadastrada com sucesso!");
                        } else {
                            view.exibirMensagem("Erro ao cadastrar Pessoa Física. Verifique os dados.");
                        }
                    } else if (tipoContato == 2) { // Pessoa Jurídica
                        String cnpj = view.solicitarCnpj();
                        PessoaJuridica pj = new PessoaJuridica(nome, telefone, email, cnpj);
                        if (controller.adicionarContato(pj)) {
                            view.exibirMensagem("Pessoa Jurídica cadastrada com sucesso!");
                        } else {
                            view.exibirMensagem("Erro ao cadastrar Pessoa Jurídica. Verifique os dados.");
                        }
                    } else {
                        view.exibirMensagem("Tipo de contato inválido.");
                    }
                    break;
                case 2: // Listar Contatos
                    List<Contato> contatos = controller.listarContatos();
                    view.exibirContatos(contatos);
                    break;
                case 3: // Atualizar Contato
                    String nomeBuscaAtualizar = view.solicitarNomeBusca();
                    List<Contato> contatosParaAtualizar = controller.buscarContatosPorNome(nomeBuscaAtualizar);

                    if (contatosParaAtualizar.isEmpty()) {
                        view.exibirMensagem("Nenhum contato encontrado com o nome: " + nomeBuscaAtualizar);
                    } else if (contatosParaAtualizar.size() > 1) {
                        view.exibirMensagem("Mais de um contato encontrado. Por favor, seja mais específico.");
                        // Aqui você poderia implementar uma lógica para o usuário escolher qual contato atualizar
                    } else {
                        Contato contatoAAtualizar = contatosParaAtualizar.get(0);
                        int campoAtualizar = view.solicitarOpcaoAtualizacao();
                        String novoValor = view.solicitarNovoValor(
                            campoAtualizar == 1 ? "nome" : (campoAtualizar == 2 ? "telefone" : "email")
                        );
                        if (controller.atualizarContato(contatoAAtualizar, campoAtualizar, novoValor)) {
                            view.exibirMensagem("Contato atualizado com sucesso!");
                        } else {
                            view.exibirMensagem("Erro ao atualizar contato. Verifique os dados.");
                        }
                    }
                    break;
                case 4: // Excluir Contato
                    String nomeBuscaExcluir = view.solicitarNomeBusca();
                    List<Contato> contatosParaExcluir = controller.buscarContatosPorNome(nomeBuscaExcluir);

                    if (contatosParaExcluir.isEmpty()) {
                        view.exibirMensagem("Nenhum contato encontrado com o nome: " + nomeBuscaExcluir);
                    } else if (contatosParaExcluir.size() > 1) {
                        view.exibirMensagem("Mais de um contato encontrado. Por favor, seja mais específico.");
                        // Aqui você poderia implementar uma lógica para o usuário escolher qual contato excluir
                    } else {
                        Contato contatoAExcluir = contatosParaExcluir.get(0);
                        if (controller.excluirContato(contatoAExcluir)) {
                            view.exibirMensagem("Contato excluído com sucesso!");
                        } else {
                            view.exibirMensagem("Erro ao excluir contato.");
                        }
                    }
                    break;
                case 0: // Sair
                    view.exibirMensagem("Saindo da Agenda de Contatos. Até mais!");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}