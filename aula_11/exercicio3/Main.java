package software_dev.aula_11.exercicio3;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
        this.nome = "";
        this.preco = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        System.out.println("Produto: " + produto.getNome());
        produto.setPreco(-1500);
        System.out.println("Preço: " + produto.getPreco());
    }
}
