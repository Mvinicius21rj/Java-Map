package main.java.Map.Ordenacao;

import java.util.Collection;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String atracao, String nome) {
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao(){
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
