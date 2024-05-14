package com.exercicio7.exercicio7.service;

import com.exercicio7.exercicio7.domain.Cliente;
import com.exercicio7.exercicio7.domain.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
public class ClienteService {
    public ClienteService(){
        clientes.add(new Cliente("Carlos", 10d, "senha1"));
        clientes.add(new Cliente("Mario", 10d, "senha2"));
        clientes.add(new Cliente("Wilson", 10d, "senha3"));
    }
    public List<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente getCliente(String nome) throws NoSuchElementException {
        return clientes.stream()
                       .filter(c -> Objects.equals(c.getNome(), nome))
                       .findFirst()
                       .orElseThrow();
    }
}
