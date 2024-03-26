package Entidades;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static Infra.HttpHelper.MontaArray;
import static Infra.HttpHelper.PegaStringAleatoria;

public class Pessoa {
    private String Nome;
    private String Sobrenome;
    private Integer Idade;

    public Pessoa() throws Exception{
        Nome = generateNome();
        Sobrenome = generateSobrenome();
        Idade = generateIdade();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String generateNome() throws Exception{
        String urlNomes = "https://venson.net.br/resources/data/nomes.txt";
        return PegaStringAleatoria(MontaArray(urlNomes));
    }


    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String generateSobrenome() throws Exception{
        String urlSobrenomes = "https://venson.net.br/resources/data/sobrenomes.txt";
        return PegaStringAleatoria(MontaArray(urlSobrenomes));
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public int generateIdade() {
        return (int)(Math.random() * 22) + 18;
    }
}
