package com.exercicio7.exercicio7.api;

import com.exercicio7.exercicio7.domain.Transacao;
import com.exercicio7.exercicio7.domain.dto.ClienteDto;
import com.exercicio7.exercicio7.service.ClienteService;
import com.exercicio7.exercicio7.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService service;

    @PostMapping("/")
    public ResponseEntity<Object> get(@RequestBody Transacao transacao) {
        try {
            var dto = service.inserir(transacao);
            return ResponseEntity.status(200).body(dto);
        } catch(Exception e) {
            return ResponseEntity.status(500).body("Erro: " + e.getMessage());
        }
    }
}
