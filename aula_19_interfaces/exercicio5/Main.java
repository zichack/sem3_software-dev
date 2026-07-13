package software_dev.aula_19_interfaces.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

interface PagamentoGame{
    void processarPagamento();
}

class PixGame implements PagamentoGame{
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix...");
    }
}

class CartaoGame implements PagamentoGame{
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Cartão...");
    }
}

class PaypalGame implements PagamentoGame{
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via PayPal...");
    }
}

class CarrinhoCompras {
    public void finalizarCompra(PagamentoGame metodo) {
        metodo.processarPagamento();
        System.out.println("Compra finalizada com sucesso!");
    }
}

public class Main{
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while(escolha != 4){
            System.out.println("Escolha um método de pagamento para finalizar sua compra (1: Pix, 2: Cartão, 3: PayPal): ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    carrinho.finalizarCompra(new PixGame());
                    escolha = 4; // encerra loop após selecionar opção de pagamento
                    break;
                case 2:
                    carrinho.finalizarCompra(new CartaoGame());
                    escolha = 4; // encerra loop após selecionar opção de pagamento
                    break;
                case 3:
                    carrinho.finalizarCompra(new PaypalGame());
                    escolha = 4; // encerra loop após selecionar opção de pagamento
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}