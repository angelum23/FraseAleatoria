package com.exer4.exer4.infra;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

public class HttpHelper {
    public static List<String> MontaArray(String url) throws Exception {
        var httpClient = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        var body = response.body();
        var array = body.split("\n");
        return Arrays.stream(array).toList();
    }

    public static String PegaStringAleatoria(List<String> listParam) {
        var arrayParam = listParam.toArray();
        var tamanhoDoArray = arrayParam.length;
        var posicaoAleatoria = (int)(Math.random() * tamanhoDoArray);
        var valorAleatorio = arrayParam[posicaoAleatoria];
        return valorAleatorio.toString();
    }
}
