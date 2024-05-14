package com.exercicio7.exercicio7.domain.dto;

public class ClienteDto {
    public ClienteDto(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    private String nome;
    private Double saldo;
}
