package software_dev.aula_8.exercicio2;

class Animal{
    String nome;
}

class Cachorro extends Animal{
    String raca;
}

public class Main{
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        dog1.nome = "Athena";
        dog1.raca = "Pit Bull";

        System.out.println("Cachorro: " + dog1.nome);
        System.out.println("Raça: " + dog1.raca);
    }
}
