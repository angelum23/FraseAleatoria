package Entidades;

import static Infra.HttpHelper.MontaArray;
import static Infra.HttpHelper.PegaStringAleatoria;

public class Jogador extends Pessoa {
    public Jogador() throws Exception{
        Posicao = generatePosicao();
        Clube = generateClube();
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
