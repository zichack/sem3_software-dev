package software_dev.aula_16.exercicio3;

//armazene notas em arraylist
// calcula média
// usa constante MEDIA_MINIMA = 7

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        final double MEDIA_MINIMA = 7.0;

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(6.0);
        notas.add(7.5);

        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("Média: " + media);

        if(media >= MEDIA_MINIMA){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
        }
    }