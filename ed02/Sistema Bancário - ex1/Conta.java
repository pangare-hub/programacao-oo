/**
 * Classe abstrata que representa uma conta bancária genérica.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da conta.
     * @param cliente Nome do cliente.
     * @param saldoInicial Saldo inicial da conta.
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Realiza um depósito na conta.
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    /**
     * Realiza um saque da conta.
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) saldo -= valor;
    }

    /**
     * Transfere um valor para outra conta.
     * @param destino Conta de destino.
     * @param valor Valor a ser transferido.
     */
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    /**
     * Retorna o saldo atual da conta.
     * @return Saldo atual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Aplica os juros diários na conta (deve ser implementado pelas subclasses).
     */
    public abstract void aplicarJurosDiarios();

    /**
     * Imprime o extrato da conta (deve ser implementado pelas subclasses).
     */
    public abstract void imprimirExtrato();
}
