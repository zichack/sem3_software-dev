package software_dev.aula_13.lista_exercicios.exercicio7;

class Carro {
    private String marca;
    private int velocidade;

    public Carro(String marca, int velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    void acelerar(int valor){
        if (valor < 0) {
            System.out.println("Erro: Valor de aceleração não pode ser negativo.");
        } else {
            velocidade += valor;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        }
    }

    void frear(int valor){
        if (valor < 0) {
            System.out.println("Erro: Valor de frenagem não pode ser negativo.");
        } else if (valor > velocidade) {
            System.out.println("Erro: Valor de frenagem não pode ser maior que a velocidade atual.");
        } else {
            velocidade -= valor;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 0);
        System.out.println("Carro: " + carro.getMarca() + ", Velocidade: " + carro.getVelocidade() + " km/h");

        carro.acelerar(50);
        carro.frear(20);
        carro.frear(40);
    }
}
