/**
 * Conta salário que não aplica juros.
 */
public class ContaSalario extends Conta {

    /**
     * Construtor da Conta Salário.
     * @param cliente Nome do cliente.
     * @param saldoInicial Saldo inicial da conta.
     */
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Não aplica juros diários.
     */
    public void aplicarJurosDiarios() {
        // Sem juros
    }

    /**
     * Imprime o extrato da Conta Salário.
     */
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Salário:");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
