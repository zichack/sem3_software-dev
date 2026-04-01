package software_dev.aula_9.ecommerce;

import java.util.ArrayList;

// classe pai
class Produto{
    String nome;
    double preco;
}

// classe filha
class ProdutoFisico extends Produto{
    double peso;
}

// classe filha
class ProdutoDigital extends Produto{
    double tamanhoArquivo;
}

// classe para gerenciar o carrinho de compras
class Carrinho{
    ArrayList<Produto> produtos = new ArrayList<>();

    // método para adicionar produtos ao carrinho
    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    // método para listar os produtos no carrinho e suas características
    void listarProdutos(){
        for(Produto p : produtos){
            System.out.println("Produto: " + p.nome + "\nPreço: " + p.preco);

            // Verificar o tipo do produto e exibir informações específicas
            if(p instanceof ProdutoFisico){
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Peso: " + pf.peso + " kg");
            } else if (p instanceof ProdutoDigital){
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("Tamanho do arquivo: " + pd.tamanhoArquivo + " MB");
            }
        }
    }

    // método para calcular o valor total dos produtos no carrinho
    double calcularTotal(){
        double total = 0;
        for(Produto p : produtos){
            total += p.preco;
        }
        return total;
    }
}

// classe principal para testar o sistema de e-commerce
public class Main{
    public static void main(String[] args) {
        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.nome = "Motor Golf 1.8 GL";
        produto1.preco = 7500.00;
        produto1.peso = 325.0;

        ProdutoDigital produto2 = new ProdutoDigital();
        produto2.nome = "E-book";
        produto2.preco = 30.00;
        produto2.tamanhoArquivo = 5.0;

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        System.out.println("Produtos no carrinho:");
        carrinho.listarProdutos();

        double total = carrinho.calcularTotal();
        System.out.println("Valor total: " + total);
    }
}
