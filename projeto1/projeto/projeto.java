import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] produto = { "Faca", "Bola", "Cerveja" };
        double[] valor = { 297.00, 346.00, 2.99 };
        int[] carrinho = new int[3];
        int opcao = 0;

        do {
            System.out.println("1-Ver produtos\n2-Comprar\n3-Finalizar");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                exibir(produto, valor);
            } else if (opcao == 2) {
                exibir(produto, valor);
                System.out.println("Qual produto? (1, 2 ou 3)");
                int id = entrada.nextInt();
                System.out.println("Qual a quantidade?");
                int qtd = entrada.nextInt();
                carrinho[id - 1] = carrinho[id - 1] + qtd;
            }
        } while (opcao != 3);

        double total = 0.0;
        for (int i = 0; i < 3; i++) {
            total = total + (carrinho[i] * valor[i]);
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