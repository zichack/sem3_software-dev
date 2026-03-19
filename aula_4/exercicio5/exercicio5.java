package software_dev.aula_4.exercicio5;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double numero3 = entrada.nextDouble();
        System.out.println("Digite o quarto numero: ");
        double numero4 = entrada.nextDouble();
        System.out.println("Digite o quinto numero: ");
        double numero5 = entrada.nextDouble();

        double soma = numero1 + numero2 + numero3 + numero4 + numero5;

        System.out.println("A soma dos números é: " + soma);
        entrada.close();
    }
    
}
