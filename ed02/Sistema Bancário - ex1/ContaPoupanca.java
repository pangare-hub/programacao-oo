/**
 * Conta poupança que aplica juros de 0.08% ao dia.
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor da Conta Poupança.
     * @param cliente Nome do cliente.
     * @param saldoInicial Saldo inicial da conta.
     */
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Aplica 0.08% de juros ao dia.
     */
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008;
    }

    /**
     * Imprime o extrato da Conta Poupança.
     */
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança:");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
