package software_dev.aula_11.exercicio2;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {
        this.titular = "";
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido.");
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Maria");
        System.out.println("Titular: " + conta.getTitular());
        conta.setSaldo(-100);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
