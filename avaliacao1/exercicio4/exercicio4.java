package software_dev.avaliacao1.exercicio4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if(numero <0){
            System.out.println("O número é negativo.");
        }
        else if(numero == 0){
            System.out.println("O número é zero.");
        }
        else{
            System.out.println("O número é positivo.");
        }
    }
}
