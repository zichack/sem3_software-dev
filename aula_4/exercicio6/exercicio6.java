package software_dev.aula_4.exercicio6;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }
        entrada.close();
    }
}
