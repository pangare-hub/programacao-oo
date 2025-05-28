package folhadepagamento;
/**
 * Classe abstrata que representa um funcionário genérico no sistema de folha de pagamento.
 * Define atributos comuns como nome e salário base, e um método abstrato para cálculo de salário.
 */
public abstract class Funcionarioo {
    /**
     * O nome do funcionário.
     */
    private String nome;
    /**
     * O salário base do funcionário.
     */
    private double salarioBase;

    /**
     * Construtor para criar uma nova instância de Funcionario.
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionarioo(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna o nome do funcionário.
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o salário base do funcionário.
     * @return O salário base do funcionário.
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Exibe os dados básicos do funcionário, incluindo nome e salário base.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para calcular o salário final.
     * @return O salário final calculado.
     */
    public abstract double calcularSalario();
}
// FuncionarioCLT.java
/**
 * Representa um funcionário contratado sob regime CLT.
 * Este tipo de funcionário recebe um adicional fixo sobre o salário base.
 */
public class FuncionarioCLT extends Funcionario {
    /**
     * O valor do adicional fixo para funcionários CLT.
     */
    private static final double ADICIONAL_FIXO = 300.0;

    /**
     * Construtor para criar uma nova instância de FuncionarioCLT.
     * @param nome O nome do funcionário CLT.
     * @param salarioBase O salário base do funcionário CLT.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final para um funcionário CLT, adicionando o adicional fixo ao salário base.
     * @return O salário final calculado para o funcionário CLT.
     */
    public double calcularSalario() {
        return getSalarioBase() + ADICIONAL_FIXO;
    }

    private double getSalarioBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void exibirDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
// FuncionarioTemporario.java
/**
 * Representa um funcionário temporário.
 * Este tipo de funcionário tem um desconto fixo sobre o salário base.
 */
public class FuncionarioTemporario extends Funcionario {
    /**
     * O valor do desconto fixo para funcionários temporários.
     */
    private static final double DESCONTO_FIXO = 100.0;

    /**
     * Construtor para criar uma nova instância de FuncionarioTemporario.
     * @param nome O nome do funcionário temporário.
     * @param salarioBase O salário base do funcionário temporário.
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final para um funcionário temporário, subtraindo o desconto fixo do salário base.
     * @return O salário final calculado para o funcionário temporário.
     */
    public double calcularSalario() {
        return getSalarioBase() - DESCONTO_FIXO;
    }

    private double getSalarioBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void exibirDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
// ProgramaFolha.java
/**
 * Classe principal para demonstrar o sistema de folha de pagamento.
 * Cria instâncias de diferentes tipos de funcionários e exibe seus dados e salários calculados.
 */
public class ProgramaFolha {
    /**
     * Método principal que inicia a execução do programa.
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criação de instâncias de funcionários
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);

        // Exibição dos dados e salário final para Carlos
        System.out.println("Dados do Funcionário CLT:");
        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println(); // Linha em branco para melhor visualização

        // Exibição dos dados e salário final para Ana
        System.out.println("Dados do Funcionário Temporário:");
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}