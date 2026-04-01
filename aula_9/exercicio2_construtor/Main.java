package software_dev.aula_9.exercicio2_construtor;

class Carro{
    String marca;
    String modelo;

    public Carro(){};

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
    }
}

public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
    }
}
