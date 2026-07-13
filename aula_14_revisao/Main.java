import java.util.ArrayList;

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O CPF não pode ser vazio.");
        }
        if (cpf.length() < 11) {
            throw new IllegalArgumentException("Erro: O CPF deve ter no mínimo 11 caracteres.");
        }
        this.cpf = cpf;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private double preco;

    public Carro(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        setPreco(preco); // Chama a validação de preço
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getPreco() {
        return this.preco;
    }

    private void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Erro: O preço deve ser maior que 0.");
        }
        this.preco = preco;
    }

    public void aplicarDesconto(double percentualDeDesconto) {
        if (percentualDeDesconto > 0 && percentualDeDesconto <= 100) {
            this.preco -= this.preco * (percentualDeDesconto / 100);
        }
    }
}

class Estoque {
    private ArrayList<Carro> carros;

    public Estoque() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void listarCarros() {
        System.out.println("===== ESTOQUE =====");
        for (Carro carro : carros) {
            System.out.printf("%s %s - R$ %.0f\n", carro.getMarca(), carro.getModelo(), carro.getPreco());
        }
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Carro carro : carros) {
            total += carro.getPreco();
        }
        return total;
    }

    public Carro mostrarCarroMaisCaro() {
        if (carros.isEmpty()) return null;
        
        Carro maisCaro = carros.get(0);
        for (Carro carro : carros) {
            if (carro.getPreco() > maisCaro.getPreco()) {
                maisCaro = carro;
            }
        }
        return maisCaro;
    }
}

class Venda {
    private Cliente cliente;
    private Carro carro;

    public Venda(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public void mostrarResumoVenda() {
        System.out.println("===== VENDA =====");
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("CPF: " + this.cliente.getCpf());
        System.out.println("Carro: " + this.carro.getMarca() + " " + this.carro.getModelo());
        System.out.printf("Preço: R$ %.0f\n", this.carro.getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", "12345678900");

        Carro carro1 = new Carro("Toyota", "Corolla", 120000);
        Carro carro2 = new Carro("Honda", "Civic", 130000);
        Carro carro3 = new Carro("Fiat", "Argo", 80000);

        Estoque estoque = new Estoque();
        estoque.adicionarCarro(carro1);
        estoque.adicionarCarro(carro2);
        estoque.adicionarCarro(carro3);

        estoque.listarCarros();

        System.out.printf("Valor total do estoque: R$ %.0f\n", estoque.calcularValorTotalEstoque());

        Carro maisCaro = estoque.mostrarCarroMaisCaro();
        // System.out.println("\nCarro mais caro: " + maisCaro.getMarca() + " " + maisCaro.getModelo());

        Venda venda = new Venda(cliente, carro2); 
        venda.mostrarResumoVenda();
    }
}