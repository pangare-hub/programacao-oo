/**
 * Conta corrente que aplica juros de 0.1% ao dia.
 */
public class ContaCorrente extends Conta {

    /**
     * Construtor da Conta Corrente.
     * @param cliente Nome do cliente.
     * @param saldoInicial Saldo inicial da conta.
     */
    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Aplica 0.1% de juros ao dia.
     */
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001;
    }

    /**
     * Imprime o extrato da Conta Corrente.
     */
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente:");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
