package software_dev.aula_3.exercicio8;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int i = 1;
        int soma = 0;

        while(i!=0){

            System.out.println("Digite um numero: ");
            i = entrada.nextInt();

            soma = soma + i;

        }

    System.out.println("Soma total: " + soma);

    }
}
