package software_dev.aula_4.exercicio4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int i = entrada.nextInt();

        if (i>=0) {
            System.out.println(i);
            i--;
            while (i >= 0) {
                System.out.println(i);
                i--;
            }
        } else {
            System.out.println("O número é negativo.");
        }
        entrada.close();
    }
}
