package org.example;

import Entidades.Jogador;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador();
        jogador.setIdade(18);

        System.out.println("O jogador " + jogador.getNome() + " " + jogador.getSobrenome() +
                           " que joga na posição de " + jogador.getPosicao() + " tem " + jogador.getIdade() +
                           " anos, defende o clube " + jogador.getClube());
    }
}