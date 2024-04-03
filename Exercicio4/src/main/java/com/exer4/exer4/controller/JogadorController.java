package com.exer4.exer4.controller;

import com.exer4.exer4.domain.Jogador;
import com.exer4.exer4.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadorController {
    private final JogadorService service;
    @Autowired
    public JogadorController(JogadorService service) {
        this.service = service;
    }

    @GetMapping("/jogador")
    public ResponseEntity<Object> jogador() {
        try{
            Jogador jogador = this.service.GerarJogador();
            String frase = this.service.GerarFraseDoJogador(jogador);
            return ResponseEntity.status(200).body(frase);
        } catch (Exception e) {
            return ResponseEntity.status(200).body("Erro ao gerar o jogador: " + e.getMessage());
        }
    }
}
