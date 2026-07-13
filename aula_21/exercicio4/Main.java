package software_dev.aula_21.exercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");

        try{
            System.out.println(nomes.get(10));
        } catch(IndexOutOfBoundsException e){
            System.out.println("Posição inválida!");
        }
    }
}
