package software_dev.aula_11.exercicio7;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);;
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
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro! O preço não pode ser negativo.");
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

