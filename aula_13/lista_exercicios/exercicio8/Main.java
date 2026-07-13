package software_dev.aula_13.lista_exercicios.exercicio8;


// O erro aqui é que a lista de produtos não foi inicializada, o que causará um NullPointerException quando tentarmos adicionar um produto.

// Correção

import java.util.ArrayList;

class Pedido {
    private ArrayList<String> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

        public ArrayList<String> getProdutos() {
            return produtos;
        }

}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarProduto("Camiseta");
        pedido.adicionarProduto("Calça");
    }
}
