package org.example.entidade;

import java.util.ArrayList;

public class Turma {
    private final int tamanhoArrayAluno;
    private String nome;

    private ArrayList<Aluno> alunos;



    public Turma(String nome, int size)
    {

        this.nome = nome;
        alunos = new ArrayList<>();
        this.tamanhoArrayAluno = size;

    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno aluno){
        if(alunos.size()== tamanhoArrayAluno ){
            throw new RuntimeException("Número de alunos excedente");
        }
        alunos.add(aluno);

    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
