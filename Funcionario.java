/**
 * Classe abstrata que representa um funcionário genérico.
 * Define estrutura comum para diferentes tipos de funcionários.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     *
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados básicos do funcionário: nome e salário base.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses
     * para calcular o salário final do funcionário.
     *
     * @return Salário final calculado.
     */
    public abstract double calcularSalario();
}
