/**
 * Representa um documento de texto com título e conteúdo.
 */
public class DocumentoTexto implements Imprimivel {
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
     * Exibe o título em letras maiúsculas seguido do conteúdo.
     */
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
        System.out.println();
    }
}
