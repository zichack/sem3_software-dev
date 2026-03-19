package atividade3;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
            if (matriz[i][j] == 15) {
                System.out.println("Quadrado mágico!");
            }
            else{
                System.out.println("Não é um quadrado mágico!");
            }
        
        };
    }
}

