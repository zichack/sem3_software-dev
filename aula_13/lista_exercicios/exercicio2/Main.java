package software_dev.aula_13.lista_exercicios.exercicio2;

class Produto {
    // o erro aqui é que os atributos são públicos, permitindo que sejam atribuídos valores inválidos, como um preço negativo.
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", -100);

        if (p.getPreco() < 0) {
            System.out.println("Erro: Preço do produto não pode ser negativo.");
        } else {
            System.out.println("Produto: " + p.getNome() + ", Preço: " + p.getPreco());
        }
    }
}
