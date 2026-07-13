package software_dev.aula_21.exercicio1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Digite um numero: ");
            int num1 = entrada.nextInt();
            System.out.println("Digite um número:  ");
            int num2 = entrada.nextInt();

            double result = num1/num2;

            System.out.println("O valor da sua divisão foi: " +result);
        }catch(ArithmeticException e){
            System.out.println("Não é possível dividir por 0");
        }
    }
}