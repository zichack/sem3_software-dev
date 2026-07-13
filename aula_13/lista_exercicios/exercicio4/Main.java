package software_dev.aula_13.lista_exercicios.exercicio4;

class ContaBancaria {

    // o erro aqui é que o atributo saldo é privado, mas não há um método público para atribuir um valor a ele, o que impede que seja possível definir um saldo inicial para a conta.
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    void validarSaldo() {
        if (saldo < 0) {
            System.out.println("Erro: Saldo não pode ser negativo.");
        } else {
            System.out.println("Saldo válido.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0);
        conta.setSaldo(-500);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        conta.validarSaldo();
        }
}