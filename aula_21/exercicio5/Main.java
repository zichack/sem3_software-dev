package software_dev.aula_21.exercicio5;

class ContaBancaria{
    private double saldo = 500;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor>saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
        saldo -= valor;
        System.out.println("Saque realizado!");
    }
}
class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}

public class Main{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        try{
            conta.sacar(1000);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}