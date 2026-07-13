package model;

public class Produto {
    private String nome;
    private double preco;

    // Construtor, getters e setters
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}