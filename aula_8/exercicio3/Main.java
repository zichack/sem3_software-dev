package software_dev.aula_8.exercicio3;

class Veiculo{
    String marca;
    String modelo;
}

class Carro extends Veiculo{
    int numeroPortas;
}

class Moto extends Veiculo{
    int cilindradas;
}

public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.numeroPortas = 4;

        Moto moto1 = new Moto();
        moto1.marca = "Honda";
        moto1.modelo = "CB500";
        moto1.cilindradas = 500;

        System.out.println("Carro: " + carro1.marca + " " + carro1.modelo);
        System.out.println("Número de Portas: " + carro1.numeroPortas);

        System.out.println("Moto: " + moto1.marca + " " + moto1.modelo);
        System.out.println("Cilindradas: " + moto1.cilindradas);
    }
}