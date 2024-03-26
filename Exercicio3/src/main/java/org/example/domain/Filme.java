package org.example.domain;

import org.example.enums.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Filme implements Indicavel {
    @Autowired
    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    private String nome;
    private Tipo tipo = Tipo.Filme;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


    private Boolean elegivel = false;
    private String genero;
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
