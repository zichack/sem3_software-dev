import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = {"Capa Silicone", "Película Vidro", "Carregador"};
        double[] valores = {55.0, 35.0, 150.0};
        int[] carrinho = new int[3];
        int opcao = 0;
        
        do {
            System.out.println("\n1-Ver Produtos | 2-Comprar | 3-Finalizar");
            opcao = entrada.nextInt();
            
            if (opcao == 1) {
                exibir(nomes, valores);
            } else if (opcao == 2) {
                exibir(nomes, valores);
                System.out.println("Qual produto? (1, 2 ou 3)");
                int id = entrada.nextInt();
                System.out.println("Quantas unidades?");
                int qtd = entrada.nextInt();
                carrinho[id - 1] = carrinho[id - 1] + qtd;
            }
        } while (opcao != 3);
        
        double total = 0.0;
        for (int i = 0; i < 3; i++) {
            total = total + (carrinho[i] * valores[i]);
        }
        
        if (total > 200.0) {
            total = total - (total * 0.10);
        }
        System.out.println("\nTotal da compra: R$ " + total);
    }
    
    public static void exibir(String[] n, double[] v) {
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " - " + n[i] + " : R$ " + v[i]);
        }
    }
}