package org.example.domain;

import org.example.enums.Tipo;
import org.springframework.stereotype.Component;

@Component
public class Ator implements Indicavel {
    public Ator(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    private String nome;
    private String nacionalidade;
    private Tipo tipo = Tipo.Ator;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    private Boolean elegivel = false;
    private Short numeroDeIndicacoes = 0;

    @Override
    public Boolean getElegivel() {
        return this.elegivel;
    };
    @Override
    public void setElegivel(Boolean elegivel) {
        this.elegivel = elegivel;
    };
    @Override
    public Short getNumeroDeIndicacoes() {
        return this.numeroDeIndicacoes;
    };
    @Override
    public void indicar() {
        this.numeroDeIndicacoes++;
    };

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
