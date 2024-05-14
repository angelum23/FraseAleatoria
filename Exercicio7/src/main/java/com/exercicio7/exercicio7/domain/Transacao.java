package com.exercicio7.exercicio7.domain;

import com.exercicio7.exercicio7.domain.dto.TransacaoDto;
import com.exercicio7.exercicio7.service.TransacaoService;
import org.springframework.stereotype.Component;

public class Transacao {
    public Transacao(String recebedor, String pagador, Double quantidade) {
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

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public TransacaoDto toClass() {
        return new TransacaoDto(getRecebedor(), getPagador(), getQuantidade());
    }
}
