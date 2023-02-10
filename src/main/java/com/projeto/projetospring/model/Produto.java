package com.projeto.projetospring.model;

public class Produto {
    // #region Atributos
    private Integer id;

    private String nonme;

    private Integer quantidade;

    private Double valor;

    private String observacao;
    // #endregion

    // #region Método GET E SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNonme() {
        return nonme;
    }

    public void setNonme(String nonme) {
        this.nonme = nonme;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    // #endregion

}
