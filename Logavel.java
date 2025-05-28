/**
 * Interface para registro de logs.
 */
public interface Logavel {
    /**
     * Registra uma operação no log de auditoria.
     * @param operacao descrição da operação realizada
     */
    void registrarLog(String operacao);
}
