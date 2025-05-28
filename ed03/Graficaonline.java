package graficaonline;

/**
 * Interface que define o comportamento comum para objetos que podem ser impressos.
 */
public interface Imprimivel {
    /**
     * Método responsável por imprimir as informações do objeto.
     */
    void imprimir();
}
//DocumentoTexto.java
/**
 * Representa um documento de texto com título e conteúdo.
 */
public class DocumentoTexto implements Graficaonline {
    private String titulo;
    private String conteudo;

    /**
     * Construtor da classe DocumentoTexto.
     * 
     * @param titulo   Título do documento.
     * @param conteudo Conteúdo do documento.
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Imprime o título em letras maiúsculas seguido do conteúdo.
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
        System.out.println();
    }
}
/**
 * Representa uma imagem digital com nome de arquivo e resolução.
 */
public class ImagemDigital implements Graficaonline {
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
     * Imprime o nome do arquivo e sua resolução.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
        System.out.println();
    }
}
/**
 * Representa um gráfico estatístico com título e tipo.
 */
public class GraficoEstatistico implements Graficaonline {
    private String titulo;
    private String tipoGrafico;

    /**
     * Construtor da classe GraficoEstatistico.
     * 
     * @param titulo      Título do gráfico.
     * @param tipoGrafico Tipo do gráfico (ex: "barra", "pizza").
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Imprime o tipo do gráfico e o título em letras maiúsculas.
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase());
        System.out.println("Título: " + titulo.toUpperCase());
        System.out.println();
    }
}

