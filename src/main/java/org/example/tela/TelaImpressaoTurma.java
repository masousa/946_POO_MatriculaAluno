package org.example.tela;

import org.example.entidade.Aluno;
import org.example.entidade.Turma;

public class TelaImpressaoTurma {
    public static void imprimirTurma(Turma turma) {

        for (int i = 0; i < turma.getAlunos().size(); i++) {
            Aluno aluno = turma.getAlunos().get(i);
        }
        for (Aluno aluno : turma.getAlunos()) {
            System.out.printf("Nome: %s , Matricula: %s %s  %n"
                    ,aluno.getNome(),aluno.getMatricula(),aluno.getNota().notaFormatada());
        }

    }
}
