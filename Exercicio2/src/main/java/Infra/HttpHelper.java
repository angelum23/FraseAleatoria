package Infra;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpHelper {
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
