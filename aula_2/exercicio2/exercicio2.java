package software_dev.aula_2.exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args){
        System.out.println("Digite sua idade:\n");
        Scanner idade = new Scanner(System.in);
        int numero;
        numero = idade.nextInt();
        System.out.println("Sua idade é: " + numero);
        idade.close();
    }
    
}
