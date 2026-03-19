package software_dev.aula_3.exercicio4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero = 1;

        while (numero !=0){

            System.out.print("Digite um número (0 para sair): ");
            numero = entrada.nextInt();
        }

    System.out.print("Programa finalizado.");

    }
    
}
