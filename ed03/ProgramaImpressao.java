/**
 * Classe principal responsável por testar as impressões.
 */
public class ProgramaImpressao {
    /**
     * Método principal que executa o programa de impressão.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de Vendas", "barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        doc.imprimir();
        img.imprimir();
        grafico.imprimir();
        relatorio.imprimir();
    }
}
