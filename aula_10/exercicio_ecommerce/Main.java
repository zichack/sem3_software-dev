package software_dev.aula_10.exercicio_ecommerce;

import java.util.ArrayList;

class Produto {
    String nome;
    double preco;

    // construtor
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

}

class ProdutoFisico extends Produto {
    double peso;

    // construtor
    ProdutoFisico(String nome, double preco, double peso){
        super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    double tamanhoArquivo;

    // construtor
    ProdutoDigital(String nome, double preco, double tamanhoArquivo){
        super(nome, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }
}

class Carrinho{
    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    void listarProdutos(){
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.nome + ", Preço: R$" + p.preco);

            if (p instanceof ProdutoFisico) {
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Peso: " + pf.peso + " kg");
            } else if (p instanceof ProdutoDigital) {
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("Tamanho do arquivo: " + pd.tamanhoArquivo + " MB");
            }
        }
    }

    void calcularTotal(){
        double total = 0;

        for (Produto p : produtos) {
            total += p.preco;
        }

        System.out.println("Total da compra: R$" + total);
    }
}

public class Main{
    public static void main(String[] args) {
        ProdutoFisico p1 = new ProdutoFisico("Notebook", 3500.0, 2.5);
        ProdutoDigital p2 = new ProdutoDigital("E-book", 50.0, 5.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        
        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}