package org.example.banco;

import org.example.entidade.Turma;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class BancoTurma {
    private  ArrayList<Turma> turmas;

    private static BancoTurma instance;

    public static BancoTurma getInstance(){
        if(Objects.isNull(instance)){
            instance = new BancoTurma();
        }
       return instance;
    }

    private BancoTurma(){
        turmas = new ArrayList<>();
    }

    public  Optional<Turma> procurarPorNome(String nome){
        if(Objects.isNull(turmas)){
            throw new RuntimeException("Não há turmas cadastradas");
        }
        for (Turma turma : turmas) {
            if(turma.getNome().equals(nome)){
                return Optional.of(turma);
            }
        }
        return Optional.empty();
    }

    public  void addTurma(Turma turma){
        if(Objects.isNull(turmas)){
            turmas = new ArrayList<>();
        }
        turmas.add(turma);
    }

}
