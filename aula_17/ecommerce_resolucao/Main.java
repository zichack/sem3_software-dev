package software_dev.aula_17.ecommerce_resolucao;

class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. Definindo preço como 0.");
            this.preco = 0;
        }
    }

    abstract double calcularPrecoFinal();

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}

class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double preco, double frete) {
        super(nome, preco);
        this.frete = frete;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + frete;
    }
}

class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }

}

class ProdutoPromocional extends Produto {
    private double desconto;

    public ProdutoPromocional(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto / 100);
    }
}

class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);

        System.out.println(produto.getNome() + "Adicionado ao carrinho!");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println(produto.getNome() + "Removido do carrinho!");
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.calcularPrecoFinal();
        }
        return total;
    }

    public void mostrarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p.getNome() + " - R$ " + p.calcularPrecoFinal());
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
        System.out.println("\nProdutos: ");
        carrinho.mostrarProdutos();
        System.out.println("\nTotal: R$ " + carrinho.calcularTotal());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        Produto p1 = new ProdutoFisico("Notebook", 3000, 150);
        Produto p2 = new ProdutoDigital("E-book", 50);
        Produto p3 = new ProdutoPromocional("Smartphone", 2000, 20);

        Carrinho carrinho = new Carrinho();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Notebook");
            System.out.println("2. Adicionar E-book");
            System.out.println("3. Adicionar Smartphone");
            System.out.println("4. Mostrar carrinho");
            System.out.println("5. Finalizar Pedido");

            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carrinho.adicionarProduto(p1);
                    break;
                case 2:
                    carrinho.adicionarProduto(p2);
                    break;
                case 3:
                    carrinho.adicionarProduto(p3);
                    break;
                case 4:
                    carrinho.mostrarProdutos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}