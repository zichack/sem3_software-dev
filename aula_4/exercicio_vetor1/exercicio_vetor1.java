package software_dev.aula_4.exercicio_vetor1;

import java.util.Scanner;

public class exercicio_vetor1 {
    public static void main(String[] args){
        
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }
}
