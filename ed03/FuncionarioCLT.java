/**
 * Representa um funcionário com contrato CLT.
 * Recebe adicional fixo de R$ 300,00 sobre o salário base.
 */
public class FuncionarioCLT extends Funcionario {

    /**
     * Construtor da classe FuncionarioCLT.
     *
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final adicionando R$ 300 ao salário base.
     *
     * @return Salário final do funcionário CLT.
     */
    @Override
    public double calcularSalario() {
        return salarioBase + 300.0;
    }
}
