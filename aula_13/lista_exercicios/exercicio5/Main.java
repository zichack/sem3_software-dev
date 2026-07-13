package software_dev.aula_13.lista_exercicios.exercicio5;

class Produto{
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

    //nao permitir preço negativo
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: Preço do produto não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }

    void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Erro: Percentual de desconto deve estar entre 0 e 100.");
        } else {
            this.preco = this.preco - (this.preco * percentual / 100);
            System.out.println("Desconto aplicado! Novo preço: " + this.preco);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Smartphone", 500);
        System.out.println("Produto: " + p.getNome() + ", Preço: " + p.getPreco());

        p.setPreco(-50); // Tentativa de definir um preço negativo
        p.aplicarDesconto(20); // Aplicar desconto válido
        p.aplicarDesconto(150); // Tentativa de aplicar um desconto inválido
    }
}


