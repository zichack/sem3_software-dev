package exercicio2_fixacao;

public class exercicio2_fixacao {
    static void alterarVetor(int vetor) {
        vetor = 10;

        System.out.println("O valor dentro do método alterarVetor é: " + vetor);
    }

public static void main(String[] args){
    int numero = 1;

    alterarVetor(numero);
    System.out.println("O valor da variável número é: " + numero);
}   
}
