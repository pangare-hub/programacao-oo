/**
 * Representa um relatório em PDF com autor e número de páginas.
 */
public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    /**
     * Construtor da classe RelatorioPDF.
     *
     * @param autor         Nome do autor do relatório.
     * @param numeroPaginas Número total de páginas do relatório.
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Exibe o nome do autor e o número de páginas.
     */
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas);
        System.out.println();
    }
}
