package com.exercicio7.exercicio7.domain;

import com.exercicio7.exercicio7.domain.dto.ClienteDto;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Cliente {
    public Cliente(String nome, Double saldo, String senha) {
        this.nome = nome;
        this.saldo = saldo;
        this.senha = senha;
    }

    private String nome;
    private Double saldo;
    private String senha;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public ClienteDto toClass() {
        return new ClienteDto(getNome(), getSaldo());
    }
}
