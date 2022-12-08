package org.example.tela;

import org.example.entidade.Aluno;

import java.util.Scanner;

public class TelaCadastroAluno {

    public static Aluno cadastrarAluno(Scanner scanner){

        System.out.println("Informe o nome do aluno");
        String nome = scanner.next();
        System.out.println("Informe a idade do aluno");
        int idade = scanner.nextInt();

        return new Aluno(nome, idade);
    }


}
