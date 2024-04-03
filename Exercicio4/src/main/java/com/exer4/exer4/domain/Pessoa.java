package com.exer4.exer4.domain;

public class Pessoa {
    private String Nome;
    private String Sobrenome;
    private Integer Idade;

    public Pessoa(String nome, String sobrenome, Integer idade) throws Exception{
        this.Nome = nome;
        this.Sobrenome = sobrenome;
        this.Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }
}
