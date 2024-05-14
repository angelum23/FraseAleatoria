package com.exercicio7.exercicio7.service;

import com.exercicio7.exercicio7.domain.Cliente;
import com.exercicio7.exercicio7.domain.Transacao;
import com.exercicio7.exercicio7.domain.dto.TransacaoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {
    public List<Transacao> transacaos = new ArrayList<Transacao>();
    public TransacaoService(){
        transacaos.add(new Transacao("Carlos", "Mario", 10d));
        transacaos.add(new Transacao("Mario", "Carlos", 10d));
    }

    public TransacaoDto inserir(Transacao transacao) {
        transacaos.add(transacao);
        return transacao.toClass();
    }
}
