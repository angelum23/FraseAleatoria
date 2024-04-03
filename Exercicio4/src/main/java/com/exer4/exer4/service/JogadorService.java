package com.exer4.exer4.service;

import com.exer4.exer4.domain.Jogador;
import com.exer4.exer4.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.exer4.exer4.infra.HttpHelper.PegaStringAleatoria;

@Service
public class JogadorService {
    public JogadorService(){
    }

    public Integer generateIdade() {
        return (int)(Math.random() * 22) + 18;
    }

    public Jogador GerarJogador() throws Exception {
        var repository = new JogadorRepository();
        var nome = PegaStringAleatoria(repository.getNomes());
        var sobrenome = PegaStringAleatoria(repository.getSobrenomes());
        var idade = generateIdade();
        var clube = PegaStringAleatoria(repository.getClubes());
        var posicao = PegaStringAleatoria(repository.getPosicoes());

        return new Jogador (
            nome, sobrenome, idade, posicao, clube
        );
    }

    public String GerarFraseDoJogador(Jogador jogador) {
        return "O jogador " + jogador.getNome() + " " + jogador.getSobrenome() +
                " que joga na posição de " + jogador.getPosicao() + " tem " + jogador.getIdade() +
                " anos, defende o clube " + jogador.getClube();
    }
}
