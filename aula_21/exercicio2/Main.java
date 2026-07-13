package software_dev.aula_21.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Digite a sua idade: ");
            int idade = entrada.nextInt();

            System.out.println("Idade: " +idade);
        }catch(InputMismatchException e){
            System.out.println("Erro! Digite apenas números inteiros.");
        }
    }
    
}
