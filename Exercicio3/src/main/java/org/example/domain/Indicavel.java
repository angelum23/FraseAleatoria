package org.example.domain;

import org.example.enums.Tipo;

public interface Indicavel {
    Tipo tipo = Tipo.Default;
    Tipo getTipo();
    void setTipo(Tipo tipo);

    Boolean elegivel = false;
    Boolean getElegivel();
    void setElegivel(Boolean elegivel);

    Short numeroDeIndicacoes = 0;
    Short getNumeroDeIndicacoes();
    void indicar();
}