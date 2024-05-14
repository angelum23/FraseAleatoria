package com.exercicio7.exercicio7.api;

import com.exercicio7.exercicio7.domain.dto.ClienteDto;
import com.exercicio7.exercicio7.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping("/")
    public ResponseEntity<Object> get(@RequestParam("nome") String nome) {
        try {
            ClienteDto dto = service.getCliente(nome).toClass();
            return ResponseEntity.status(200).body(dto);
        } catch(Exception e) {
            return ResponseEntity.status(500).body("Erro: " + e.getMessage());
        }
    }
}
