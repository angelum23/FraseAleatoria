package com.exercicio7.exercicio7.domain.dto;

public class TransacaoDto {
    public TransacaoDto(String recebedor, String pagador, Double quantidade) {
        this.recebedor = recebedor;
        this.pagador = pagador;
        this.quantidade = quantidade;
    }

    private String recebedor;
    private String pagador;
    private Double quantidade;

    public String getRecebedor() {
        return recebedor;
    }

    public String getPagador() {
        return pagador;
    }

    public Double getQuantidade() {
        return quantidade;
    }
}
