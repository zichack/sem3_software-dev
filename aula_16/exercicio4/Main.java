package software_dev.aula_16.exercicio4;

// sistema bancario
// classe contaBancaria
// atributos: titular e saldo
// regras: taxa bancaria constante (final), método para sacar dinheiro e descontar taxa fixa de R$2,00

class contaBancaria{
    private String titular;
    private double saldo;

    final double TAXA_BANCARIA = 2.0;

    public contaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
        saldo -= TAXA_BANCARIA;

        if(saldo > valor + TAXA_BANCARIA){
            saldo -=valor;
            saldo -= TAXA_BANCARIA;
        } else{
            System.out.println("Saldo insuficiente para realizar o saque.");
            return;
        }
        System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

}

public class Main{
    public static void main(String[] args){
        contaBancaria c1 = new contaBancaria("Mateus", 1000.0);
        c1.sacar(1000.0);
    }

}