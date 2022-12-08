package org.example;

import org.example.banco.BancoTurma;
import org.example.entidade.Turma;

import java.util.Scanner;

public class TelaCadastroTurma {
    public static Turma cadastrarTurma(Scanner scanner) {
        System.out.println("Informe o nome da turma");
        final String nome = scanner.next();
        System.out.println("Informe o número de alunos");
        final Turma turma = new Turma(nome, scanner.nextInt());
        BancoTurma bancoTurma = BancoTurma.getInstance(); //new BancoTurma(); // objeto 1
        bancoTurma.addTurma(turma);
        //BancoTurma.addTurma(turma);
        System.out.println("Turma cadastrada");
        return turma;
    }
}
