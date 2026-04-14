package ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Produto {
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

    public void aplicarDesconto(double percentual) {
        this.preco = this.preco - (this.preco * percentual / 100);
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

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void mostrarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p.getNome() + " - R$ " + p.getPreco());
            }
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}

class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho) { 
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void mostrarResumo() {
        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produtos:");
        carrinho.mostrarProdutos();
        System.out.println("Total: R$ " + carrinho.calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCli = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCli);
        Carrinho carrinho = new Carrinho();

        Produto produto1 = new Produto("Notebook", 3000.0);
        Produto produto2 = new Produto("Mouse", 100.0);
        Produto produto3 = new Produto("Teclado", 200.0);

        produto1.aplicarDesconto(10);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== MENU DE PRODUTOS =====");
            System.out.println("1 - " + produto1.getNome() + " - R$ " + produto1.getPreco());
            System.out.println("2 - " + produto2.getNome() + " - R$ " + produto2.getPreco());
            System.out.println("3 - " + produto3.getNome() + " - R$ " + produto3.getPreco());
            System.out.println("4 - Ver carrinho");
            System.out.println("5 - Remover produto do carrinho");
            System.out.println("6 - Calcular total");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carrinho.adicionarProduto(produto1);
                    break;
                case 2:
                    carrinho.adicionarProduto(produto2);
                    break;
                case 3:
                    carrinho.adicionarProduto(produto3);
                    break;
                case 4:
                    carrinho.mostrarProdutos();
                    break;
                case 5:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    scanner.nextLine();
                    String nomeRemover = scanner.nextLine();
                    Produto produtoRemover = null;
                    for (Produto p : carrinho.getProdutos()) {
                        if (p.getNome().equalsIgnoreCase(nomeRemover)) {
                            produtoRemover = p;
                            break;
                        }
                    }
                    if (produtoRemover != null) {
                        carrinho.removerProduto(produtoRemover);
                        System.out.println(nomeRemover + " removido do carrinho.");
                    } else {
                        System.out.println("Produto não encontrado no carrinho.");
                    }
                    break;
                case 6:
                    System.out.println("Total do carrinho: R$ " + carrinho.calcularTotal());
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        Pedido pedido = new Pedido(cliente, carrinho);
        pedido.mostrarResumo();

        scanner.close();
    }
}