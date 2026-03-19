package software_dev.avaliacao1.exercicio8;

public class exercicio8 {
    public static void main(String[] args) {
        int[] numero = new int[5];
        numero[0] = 0;
        numero[1] = 8;
        numero[2] = 9;
        numero[3] = 6;
        numero[4] = 10;

        int menor = 0;
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            if(numero[i] < menor){
                menor = numero[i];
            }
        }

        for(int i = 0; i < 5; i++){
            if (numero[i] > maior){
                maior = numero[i];
            }
        }

        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior número é: " + maior);
    }
}
