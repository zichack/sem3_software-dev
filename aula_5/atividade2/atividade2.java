package atividade2;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numero[] = new float[10];

        float soma = 0;
        float media = 0;
        float maior = 0;
        float menor = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            numero[i] = scanner.nextFloat();
            soma += numero[i];
        }
        {
        media = soma / 10;
        }

        for(int i = 0; i < 10; i++){
            if(numero[i] > maior){
                maior = numero[i];
            }
        }

        menor = numero[0];
        
        for(int i = 0; i < 10; i++){
            if(numero[i] < menor){
                menor = numero[i];
            }
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);


        scanner.close();
    }
    
}
