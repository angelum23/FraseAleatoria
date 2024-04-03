package com.exer4.exer4.domain;
import static com.exer4.exer4.infra.HttpHelper.MontaArray;
import static com.exer4.exer4.infra.HttpHelper.PegaStringAleatoria;

public class Jogador extends Pessoa {
    public Jogador(String nome, String sobrenome, Integer idade, String posicao, String clube) throws Exception{
        super(nome, sobrenome, idade);
        this.Posicao = posicao;
        this.Clube = clube;
    }
    private String Posicao;
    private String Clube;
    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }

    public String generatePosicao() throws Exception{
        String urlPosicao = "https://venson.net.br/resources/data/posicoes.txt";
        return PegaStringAleatoria(MontaArray(urlPosicao));
    }

    public String getClube() {
        return Clube;
    }

    public void setClube(String clube) {
        Clube = clube;
    }

    public String generateClube() throws Exception{
        String urlClube = "https://venson.net.br/resources/data/clubes.txt";
        return PegaStringAleatoria(MontaArray(urlClube));
    }
}
