package software_dev.aula_18.lista_exercicio.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * abstract: Define uma classe que não pode ser instanciada diretamente (não se pode criar um "new Streaming").
 * Serve como base (modelo) para as outras classes.
 */
abstract class Streaming {
    // final: Garante que o valor da variável não possa ser alterado após a inicialização
    private final String titulo;
    private final double duracao; 

    // Construtor: Método especial chamado quando criamos um objeto desta classe
    public Streaming(String titulo, double duracao) {
        // this: Referencia o atributo da própria classe, distinguindo-o do parâmetro recebido
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    // abstract method: Um método sem corpo que obriga as classes filhas a implementarem sua própria lógica
    public abstract void calcularValorAssinatura();
}

/**
 * extends: Indica que Filme HERDA de Streaming, ou seja, Filme é um tipo de Streaming.
 */
class Filme extends Streaming {
    private int taxaExtra = 5; 

    public Filme(String titulo, double duracao) {
        // super: Chama o construtor da classe pai (Streaming) para inicializar os atributos herdados
        super(titulo, duracao);
    }

    // @Override: Indica que estamos sobrescrevendo o método abstrato do pai com uma lógica específica
    @Override
    public void calcularValorAssinatura() {
        double valorBase = 10; 
        double valorFinal = valorBase + taxaExtra;
        System.out.println("Valor da assinatura para o filme '" + getTitulo() + "': R$ " + valorFinal);
    }
}

class Serie extends Streaming {
    private int numeroEpisodios;

    public Serie(String titulo, double duracao, int numeroEpisodios) {
        super(titulo, duracao);
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public void calcularValorAssinatura() {
        double valorBase = 10; 
        double valorFinal = valorBase * numeroEpisodios;
        System.out.println("Valor da assinatura para a série '" + getTitulo() + "': R$ " + valorFinal);
    }
}

class Documentario extends Streaming {
    public Documentario(String titulo, double duracao) {
        super(titulo, duracao);
    }

    @Override
    public void calcularValorAssinatura() {
        double valorBase = 10; 
        System.out.println("Valor da assinatura para o documentário '" + getTitulo() + "': R$ " + valorBase);
    }
}

public class Main {
    // Método principal: O ponto de entrada onde o programa começa a execução
    public static void main(String[] args) {
        // Criação do objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Polimorfismo: Uma lista do tipo pai (Streaming) que aceita qualquer filho (Filme, Serie, etc.)
        ArrayList<Streaming> catalogo = new ArrayList<>();

        int opcao = 0;
        // while: Estrutura de repetição que mantém o menu ativo enquanto a condição for verdadeira
        while (opcao != 4) {
            System.out.println("=== CATÁLOGO DE STREAMING ===");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Adicionar Série");
            System.out.println("3. Adicionar Documentário");
            System.out.println("4. Calcular Valor de Assinatura");
            System.out.print("Escolha uma opção: ");
            
            // Leitura de um inteiro do teclado
            opcao = scanner.nextInt();
            // Consome a sobra da linha após o nextInt, evitando erros na próxima leitura
            scanner.nextLine(); 

            // Estrutura condicional para decidir qual ação executar baseada no input
            if (opcao == 1) {
                System.out.println("Titulo: ");
                String title = scanner.nextLine();
                catalogo.add(new Filme(title, 120));
            } else if (opcao == 2) {
                System.out.println("Titulo: ");
                String title = scanner.nextLine();
                System.out.println("Número de episódios: ");
                int numEps = scanner.nextInt();
                scanner.nextLine(); 
                catalogo.add(new Serie(title, 120, numEps));
            } else if (opcao == 3) {
                System.out.println("Titulo: ");
                String title = scanner.nextLine();
                catalogo.add(new Documentario(title, 90));
            } else if (opcao == 4) {
                // Loop "for-each": Percorre a lista completa e aplica polimorfismo chamando o método de cada objeto
                for (Streaming s : catalogo)
                    s.calcularValorAssinatura();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}