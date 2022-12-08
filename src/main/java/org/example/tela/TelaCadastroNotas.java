package org.example.tela;

import org.example.entidade.Notas;

import java.util.Scanner;

public class TelaCadastroNotas {
    public static Notas cadastrarNovaNota(Scanner scanner) {

        System.out.println("Informe a nota 1 do aluno");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a nota 2 do aluno");
        return new Notas(nota1, scanner.nextDouble());
    }
}
