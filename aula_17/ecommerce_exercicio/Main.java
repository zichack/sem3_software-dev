package software_dev.aula_17.ecommerce_exercicio;

import java.util.ArrayList;
import java.util.Scanner;

// --- CLASSE ABSTRATA ---
abstract class Produto {
    private String nome;
    protected double preco; // protected permite que as subclasses acessem diretamente

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    // Método abstrato: cada filho DEVE implementar sua própria lógica
    public abstract void exibirDetalhes();

    // Método comum que pode ser sobrescrito
    public void aplicarDesconto(double percentual) {
        this.preco -= (this.preco * percentual / 100);
    }
}

// --- HERANÇA: ELETRÔNICO ---
class Eletronico extends Produto {
    private int mesesGarantia;

    public Eletronico(String nome, double preco, int mesesGarantia) {
        super(nome, preco);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("[Eletrônico] " + getNome() + " | Preço: R$ " + preco + " | Garantia: " + mesesGarantia + " meses");
    }

    @Override
    public void aplicarDesconto(double percentual) {
        // Exemplo de comportamento diferente: eletrônicos têm desconto limitado a 15%
        double descontoReal = Math.min(percentual, 15.0);
        super.aplicarDesconto(descontoReal);
    }
}

// --- HERANÇA: LIVRO ---
class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("[Livro] " + getNome() + " | Autor: " + autor + " | Preço: R$ " + preco);
    }
    // Livros usam o aplicarDesconto padrão da classe pai
}

// As classes Cliente, Carrinho e Pedido permanecem similares, 
// mas o Carrinho agora usa Polimorfismo.

class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.println(p.getNome() + " adicionado!");
    }

    public void mostrarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            // POLIMORFISMO: Chama exibirDetalhes() de cada subclasse específica
            for (Produto p : produtos) {
                p.exibirDetalhes();
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) total += p.getPreco();
        return total;
    }
    
    public ArrayList<Produto> getProdutos() { return produtos; }
}

class Cliente {
    private String nome;
    public Cliente(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
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
        carrinho.mostrarProdutos();
        System.out.println("Total: R$ " + carrinho.calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        System.out.print("Nome do cliente: ");
        Cliente cliente = new Cliente(scanner.nextLine());

        // Criando produtos específicos (Herança)
        Produto note = new Eletronico("Notebook Gamer", 5000.0, 12);
        Produto livro = new Livro("Clean Code", 100.0, "Robert C. Martin");
        Produto fone = new Eletronico("Headset", 200.0, 6);

        // Comportamento diferente no desconto
        note.aplicarDesconto(20); // Note será limitado a 15% por ser eletrônico
        livro.aplicarDesconto(10); // Livro aceita os 10%

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar " + note.getNome());
            System.out.println("2. Adicionar " + livro.getNome());
            System.out.println("3. Ver Carrinho");
            System.out.println("0. Finalizar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carrinho.adicionarProduto(note);
                case 2 -> carrinho.adicionarProduto(livro);
                case 3 -> carrinho.mostrarProdutos();
                case 0 -> new Pedido(cliente, carrinho).mostrarResumo();
            }
        }
        scanner.close();
    }
}