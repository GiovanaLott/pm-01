package model;

/**
 * Enumeração representando os possíveis status de uma Ordem de Serviço.
 */
public enum StatusOrdem {
    ABERTA("Aberta"),
    EM_EXECUCAO("Em Execução"),
    FINALIZADA("Finalizada");

    private final String descricao;

    StatusOrdem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
