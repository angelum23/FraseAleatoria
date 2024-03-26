package org.example.service;
import org.example.domain.Ator;
import org.example.domain.Filme;
import org.example.domain.Indicacao;
import org.example.enums.Tipo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OscarService {
    private ArrayList<Indicacao> indicacaos = new ArrayList<Indicacao>();

    public void AdicionarIndicacao(Indicacao indicacao) {
        if (!indicacao.getIndicavel().getElegivel()) {
            System.out.println("Este cara não é elegível");
            return;
        }
        indicacaos.add(indicacao);
    }

    public void mostrarListaIndicao() {
        indicacaos.forEach(indicacao -> {
            System.out.println(retornaTextoIndicacao(indicacao));
        });
    }

    public String retornaTextoIndicacao(Indicacao indicacao) {
        var indicavel = indicacao.getIndicavel();
        if (indicavel.getTipo() == Tipo.Ator) {
            var ator = (Ator)indicavel;
            return "Ator: " + ator.getNome() + ", Nacionalidade: " + ator.getNacionalidade() + ", Numero de indicações: " + ator.getNumeroDeIndicacoes();
        }
        if (indicavel.getTipo() == Tipo.Filme) {
            var filme = (Filme)indicavel;
            return "Filme: " + filme.getNome() + ", Gênero: " + filme.getGenero() + ", Numero de indicações: " + filme.getNumeroDeIndicacoes();
        }
        return "Tipo não definido";
    }
}
