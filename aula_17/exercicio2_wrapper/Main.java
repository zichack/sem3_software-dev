package software_dev.aula_17.exercicio2_wrapper;

import java.util.ArrayList;

//criar um arraylist<integer> e adicionar 3 numeros: 10, 20 e 30. imprimir todos os numeros. usar wrapper.

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
