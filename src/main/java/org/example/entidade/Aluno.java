package org.example.entidade;

import java.util.UUID;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    private Notas nota;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.matricula = UUID.randomUUID().toString();
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public Notas getNota() {
        return nota;
    }
}
