package software_dev.aula_4.exercicio3;

import java.util.Scanner;

public class exercicio3 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        switch(media >= 7 ? "Aprovado" : media >= 5 ? "Recuperação" : media < 5 ? "Reprovado" : "Erro") {
            case "Aprovado":
                System.out.println("Média: " + media + " - Aprovado");
                break;
            case "Recuperação":
                System.out.println("Média: " + media + " - Recuperação");
                break;
            case "Reprovado":
                System.out.println("Média: " + media + " - Reprovado");
                break;
            default:
                System.out.println("Erro ao calcular a média.");
                break;
        }
        entrada.close();
    }
}
