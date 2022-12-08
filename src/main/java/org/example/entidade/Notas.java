package org.example.entidade;

public class Notas {
    private double nota1;
    private double nota2;

    public Notas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public double media(){
        return (nota1+nota2)/2;
    }

    public String notaFormatada(){
        return String.format(" %n\t Nota1: %.2f, Nota2: %.2f, Media: %.2f ", nota1,nota2,media());
    }
}
