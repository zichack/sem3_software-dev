package software_dev.aula_3.exercicio9;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha = 0;

        while(senha != 1234){

            System.out.println("Digite sua senha: ");
            senha = entrada.nextInt();
            System.out.println("Senha incorreta!");

        }

        System.out.println("Senha correta.");
    }
    
}
