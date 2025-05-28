/**
 * Classe principal responsável por testar o sistema de folha de pagamento.
 */
public class ProgramaFolha {
    /**
     * Método principal que executa o programa.
     * Cria instâncias de funcionários e exibe seus dados e salários finais.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Cria funcionário CLT
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);

        // Cria funcionário temporário
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);

        // Exibe dados e salário final de Carlos
        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println();

        // Exibe dados e salário final de Ana
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}
