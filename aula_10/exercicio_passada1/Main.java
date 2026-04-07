package software_dev.aula_10.exercicio_passada1;

class ContaBancaria{
    String titular;
    double saldo;

    public ContaBancaria(){};

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Main{
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", 987.25);
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo: " + conta1.saldo);

        ContaBancaria conta2 = new ContaBancaria("Mateus", 745.56);
        System.out.println("Titular: " + conta2.titular);
        System.out.println("Saldo: " + conta2.saldo);
    }
}
