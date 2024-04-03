package com.exer4.exer4.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.exer4.exer4.infra.HttpHelper.MontaArray;

public class JogadorRepository {
    List<String> Nomes;
    List<String> Sobrenomes;
    List<String> Clubes;
    List<String> Posicoes;

    public JogadorRepository() throws Exception {
        this.Nomes = MontaArray("https://venson.net.br/resources/data/nomes.txt");
        this.Sobrenomes = MontaArray("https://venson.net.br/resources/data/sobrenomes.txt");
        this.Clubes = MontaArray("https://venson.net.br/resources/data/clubes.txt");
        this.Posicoes = MontaArray("https://venson.net.br/resources/data/posicoes.txt");
    }

    public List<String> getNomes() {
        return Nomes;
    }

    public void setNomes(List<String> nomes) {
        Nomes = nomes;
    }

    public List<String> getSobrenomes() {
        return Sobrenomes;
    }

    public void setSobrenomes(List<String> sobrenomes) {
        Sobrenomes = sobrenomes;
    }

    public List<String> getClubes() {
        return Clubes;
    }

    public void setClubes(List<String> clubes) {
        Clubes = clubes;
    }

    public List<String> getPosicoes() {
        return Posicoes;
    }

    public void setPosicoes(List<String> posicoes) {
        Posicoes = posicoes;
    }
}
