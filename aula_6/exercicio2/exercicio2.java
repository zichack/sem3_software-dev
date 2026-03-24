package software_dev.aula_6.exercicio2;

public class exercicio2 {
    String marca;
    String modelo;
    int ano;
    double velocidadeMaxima;

    void acelerar(){
        System.out.println("O carro " + marca + " " + modelo + " está acelerando. Sua velocidade máxima é de " + velocidadeMaxima + " km/h.");
    }

    public static void main(String[] args) {
        exercicio2 carro1 = new exercicio2();
        exercicio2 carro2 = new exercicio2();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;
        carro1.velocidadeMaxima = 180.0;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2019;
        carro2.velocidadeMaxima = 200.0;

        carro1.acelerar();
        carro2.acelerar();

    }
    
}
