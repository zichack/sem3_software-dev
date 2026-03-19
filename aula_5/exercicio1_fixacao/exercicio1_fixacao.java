package exercicio1_fixacao;

public class exercicio1_fixacao {
    static void alterarVetor(int[] vetor) {
        vetor[0] = 10;
    }

public static void main(String[] args){
    int[] numeros = {1, 2, 3};
    alterarVetor(numeros);
    System.out.println(numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
}
    
}