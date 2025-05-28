package folhadepagamento;
/**
 * Classe abstrata que representa um funcion�rio gen�rico no sistema de folha de pagamento.
 * Define atributos comuns como nome e sal�rio base, e um m�todo abstrato para c�lculo de sal�rio.
 */
public abstract class Funcionarioo {
    /**
     * O nome do funcion�rio.
     */
    private String nome;
    /**
     * O sal�rio base do funcion�rio.
     */
    private double salarioBase;

    /**
     * Construtor para criar uma nova inst�ncia de Funcionario.
     * @param nome O nome do funcion�rio.
     * @param salarioBase O sal�rio base do funcion�rio.
     */
    public Funcionarioo(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna o nome do funcion�rio.
     * @return O nome do funcion�rio.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o sal�rio base do funcion�rio.
     * @return O sal�rio base do funcion�rio.
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Exibe os dados b�sicos do funcion�rio, incluindo nome e sal�rio base.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sal�rio Base: " + salarioBase);
    }

    /**
     * M�todo abstrato que deve ser implementado pelas subclasses para calcular o sal�rio final.
     * @return O sal�rio final calculado.
     */
    public abstract double calcularSalario();
}
// FuncionarioCLT.java
/**
 * Representa um funcion�rio contratado sob regime CLT.
 * Este tipo de funcion�rio recebe um adicional fixo sobre o sal�rio base.
 */
public class FuncionarioCLT extends Funcionario {
    /**
     * O valor do adicional fixo para funcion�rios CLT.
     */
    private static final double ADICIONAL_FIXO = 300.0;

    /**
     * Construtor para criar uma nova inst�ncia de FuncionarioCLT.
     * @param nome O nome do funcion�rio CLT.
     * @param salarioBase O sal�rio base do funcion�rio CLT.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o sal�rio final para um funcion�rio CLT, adicionando o adicional fixo ao sal�rio base.
     * @return O sal�rio final calculado para o funcion�rio CLT.
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
 * Representa um funcion�rio tempor�rio.
 * Este tipo de funcion�rio tem um desconto fixo sobre o sal�rio base.
 */
public class FuncionarioTemporario extends Funcionario {
    /**
     * O valor do desconto fixo para funcion�rios tempor�rios.
     */
    private static final double DESCONTO_FIXO = 100.0;

    /**
     * Construtor para criar uma nova inst�ncia de FuncionarioTemporario.
     * @param nome O nome do funcion�rio tempor�rio.
     * @param salarioBase O sal�rio base do funcion�rio tempor�rio.
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o sal�rio final para um funcion�rio tempor�rio, subtraindo o desconto fixo do sal�rio base.
     * @return O sal�rio final calculado para o funcion�rio tempor�rio.
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
 * Cria inst�ncias de diferentes tipos de funcion�rios e exibe seus dados e sal�rios calculados.
 */
public class ProgramaFolha {
    /**
     * M�todo principal que inicia a execu��o do programa.
     * @param args Argumentos da linha de comando (n�o utilizados neste programa).
     */
    public static void main(String[] args) {
        // Cria��o de inst�ncias de funcion�rios
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);

        // Exibi��o dos dados e sal�rio final para Carlos
        System.out.println("Dados do Funcion�rio CLT:");
        carlos.exibirDados();
        System.out.println("Sal�rio Final: " + carlos.calcularSalario());
        System.out.println(); // Linha em branco para melhor visualiza��o

        // Exibi��o dos dados e sal�rio final para Ana
        System.out.println("Dados do Funcion�rio Tempor�rio:");
        ana.exibirDados();
        System.out.println("Sal�rio Final: " + ana.calcularSalario());
    }
}