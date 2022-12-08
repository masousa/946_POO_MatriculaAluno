package org.example.tela;

import org.example.banco.BancoTurma;
import org.example.entidade.Turma;

import java.util.Optional;
import java.util.Scanner;

public class TelaRecuperarTurma {
    public static Turma recuperarTurma(Scanner scanner) {
        System.out.println("Informe o nome da turma");
        BancoTurma bancoTurma = BancoTurma.getInstance();// new BancoTurma(); //objeto 1

        return  bancoTurma.procurarPorNome(scanner.next()).orElseThrow(() -> new RuntimeException("Turma não encontrada"));
    }
}
