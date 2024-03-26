package com.example.oscarproject;

import org.example.domain.Ator;
import org.example.domain.Filme;
import org.example.domain.Indicacao;
import org.example.domain.Indicavel;
import org.example.service.OscarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OscarProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OscarProjectApplication.class, args);

        var oscarService = new OscarService();

        var filmeIndicavel = new Filme("shrek", "comedia");
        var indicacaoFilme = new Indicacao(filmeIndicavel, "mior filme");
        indicacaoFilme.getIndicavel().indicar();

        var atorIndicavel = new Ator("shrek", "pantano");
        var indicacaoAtor = new Indicacao(atorIndicavel, "mior ator");

        oscarService.AdicionarIndicacao(indicacaoFilme);
        oscarService.AdicionarIndicacao(indicacaoAtor);

        oscarService.mostrarListaIndicao();
    }
}
