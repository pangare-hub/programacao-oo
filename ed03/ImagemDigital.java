/**
 * Representa uma imagem digital com nome de arquivo e resolução.
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor da classe ImagemDigital.
     *
     * @param nomeArquivo Nome do arquivo da imagem.
     * @param resolucao   Resolução da imagem (ex: "1920x1080").
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Exibe o nome do arquivo e sua resolução.
     */
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
        System.out.println();
    }
}
