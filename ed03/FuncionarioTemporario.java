/**
 * Representa um funcionário temporário.
 * Possui um desconto fixo de R$ 100,00 sobre o salário base.
 */
public class FuncionarioTemporario extends Funcionario {

    /**
     * Construtor da classe FuncionarioTemporario.
     *
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final subtraindo R$ 100 do salário base.
     *
     * @return Salário final do funcionário temporário.
     */
    @Override
    public double calcularSalario() {
        return salarioBase - 100.0;
    }
}
