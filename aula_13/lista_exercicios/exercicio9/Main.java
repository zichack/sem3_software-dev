package software_dev.aula_13.lista_exercicios.exercicio9;

// sistema com classe produto, com nome e preço. classe carrinho com lista de produtos. usar encapsulamento, criar métodos adicionarProduto e calcularTotal. não permitir produto com preço 0.

import java.util.ArrayList;

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

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Erro: Preço do produto deve ser maior que zero.");
        } else {
            this.preco = preco;
        }
    }
}

class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto.getPreco() > 0) {
            produtos.add(produto);
            System.out.println(produto.getNome() + " adicionado ao carrinho!");
        } else {
            System.out.println("Erro: Produto com preço inválido.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto p1 = new Produto("Camiseta", 50);
        Produto p2 = new Produto("Calça", 100);
        Produto p3 = new Produto("Tênis", -200);

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        System.out.println("Total do carrinho: " + carrinho.calcularTotal());
    }
}