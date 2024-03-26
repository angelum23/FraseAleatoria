package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        String urlNomes = "https://venson.net.br/resources/data/nomes.txt";
        String urlSobrenomes = "https://venson.net.br/resources/data/sobrenomes.txt";
        String urlClubes = "https://venson.net.br/resources/data/clubes.txt";
        String urlPosicoes = "https://venson.net.br/resources/data/posicoes.txt";

        var nome = PegaStringAleatoria(MontaArray(urlNomes));
        var sobrenome = PegaStringAleatoria(MontaArray(urlSobrenomes));
        var clube = PegaStringAleatoria(MontaArray(urlClubes));
        var posicao = PegaStringAleatoria(MontaArray(urlPosicoes));

        var idade = (int)(Math.random() * 22) + 18;

        System.out.println("O jogador " + nome + " " + sobrenome + " que joga na posição de " + posicao + " tem " + idade + " anos, defende o clube " + clube);
    }

    public static String[] MontaArray(String url) throws Exception {
        var httpClient = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        var body = response.body();
        var array = body.split("\n");
        return array;
    }

    public static String PegaStringAleatoria(String[] arrayParam) {
        var tamanhoDoArray = arrayParam.length;
        var posicaoAleatoria = (int)(Math.random() * tamanhoDoArray);
        var valorAleatorio = arrayParam[posicaoAleatoria];
        return valorAleatorio;
    }
}