/**
 * Classe principal para teste do sistema bancário.
 */
public class Main {
    /**
     * Método principal para executar as operações das contas.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200);       // Alice: 1200
        cp.sacar(100);           // Bob: 1400
        cs.transferir(cc, 300);  // Carlos: 900, Alice: 1500

        cc.aplicarJurosDiarios(); // 1500 + 0.1%
        cp.aplicarJurosDiarios(); // 1400 + 0.08%
        cs.aplicarJurosDiarios(); // sem efeito

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
