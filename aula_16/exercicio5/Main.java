package software_dev.aula_16.exercicio5;

// classe produto com nome e preço;

// regras: imposto constante usando final
// calcular preço final com imposto
// armazenar produtos em arraylist

import java.util.ArrayList;

class Produto{
    private String nome;
    private double preco;

    final double IMPOSTO = 0.2;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal(){
        return preco + (preco * IMPOSTO);
    }
}

public class Main{
    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add (new Produto("Notebook", 3000.0));
        produtos.add (new Produto("Smartphone", 1500.0));
        produtos.add (new Produto("Tablet", 2000.0));
        for(Produto p : produtos){
            System.out.println("Preço final de " + p.calcularPrecoFinal());
        }
    }
}
