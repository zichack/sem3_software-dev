package view; // <-- Adicione isso

import java.util.Scanner;

public class ProdutoView {
    private Scanner scanner = new Scanner(System.in);

    public String solicitarNome() {
        System.out.print("Digite o nome do produto: ");
        return scanner.nextLine();
    }

    public double solicitarPreco() {
        System.out.print("Digite o preço do produto: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public void exibirProduto(String nome, double preco) {
        System.out.println("\n--- Produto Cadastrado ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}