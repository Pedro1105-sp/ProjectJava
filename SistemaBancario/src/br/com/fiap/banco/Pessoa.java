package br.com.fiap.banco;

import java.io.Serial;
import java.io.Serializable;

// JAVABEAN E ENCAPSULAMENTO

public class Pessoa implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String nome;
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
