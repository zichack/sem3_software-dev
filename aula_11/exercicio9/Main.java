package software_dev.aula_11.exercicio9;

class Pedido {
    private String numero;
    private double valor;

    public Pedido(String numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public Pedido() {
        this.numero = "";
        this.valor = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) { // Precisa ser maior que zero
            this.valor = valor;
        } else {
            System.out.println("Valor inválido. Deve ser maior que zero.");
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNumero("12345");
        System.out.println("Número: " + pedido.getNumero());
        pedido.setValor(1500.0);
        System.out.println("Valor: " + pedido.getValor());
    }
}
