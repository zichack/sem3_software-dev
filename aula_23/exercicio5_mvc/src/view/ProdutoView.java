package view;

import controller.ProdutoController; // Importa a classe controladora para poder criar uma instância dela e chamar seus métodos
import model.Produto; // A View precisa conhecer a classe Produto para exibir os dados corretamente
import java.util.List; // Importa a interface List para poder receber a lista de produtos do Controller
import java.util.Scanner; // Importa a ferramenta Scanner para capturar o que o usuário digita no teclado

public class ProdutoView { // Declara a classe responsável pela interface com o usuário (menus e mensagens)
    private ProdutoController controller; // Declara uma dependência: a View precisa conhecer o Controller
    private Scanner scanner; // Declara o objeto Scanner que fará a leitura do teclado

    public ProdutoView() { // Construtor da View, chamado na inicialização
        this.controller = new ProdutoController(); // Instancia o Controller (que, ao nascer, já carrega os arquivos
                                                   // salvos)
        this.scanner = new Scanner(System.in); // Instancia o Scanner apontando para a entrada padrão (teclado)
    } // Fim do construtor

    public void iniciar() { // Método principal da View, responsável por manter o menu rodando
        int opcao = 0; // Cria uma variável inteira para armazenar o número da opção escolhida
        do { // Inicia um laço de repetição que executa o bloco abaixo e depois avalia a
             // condição de parada
            System.out.println("\n--- Menu E-commerce ---"); // Imprime o cabeçalho do menu (o \n pula uma linha)
            System.out.println("1. Cadastrar Produto"); // Imprime a opção número 1
            System.out.println("2. Exibir Produtos"); // Imprime a opção número 2
            System.out.println("3. Sair"); // Imprime a opção número 3
            System.out.print("Escolha uma opcao: "); // Pede para o usuário digitar, sem pular linha no final

            try { // Tenta executar o bloco de leitura, precavendo-se contra letras digitadas no
                  // lugar de números
                opcao = Integer.parseInt(scanner.nextLine()); // Lê a linha toda como texto e a converte para um número
                                                              // inteiro
            } catch (NumberFormatException e) { // Se o usuário digitou texto (falha na conversão), captura o erro
                opcao = 0; // Atribui 0 à opção, forçando o sistema a cair no "default" do switch abaixo
            } // Fim da captura de erro da opção

            switch (opcao) { // Avalia o valor armazenado na variável 'opcao'
                case 1: // Se o usuário digitou o número 1
                    telaCadastro(); // Chama o método secundário que gerencia a tela de criar produtos
                    break; // Sai do switch para não executar os blocos de baixo e reinicia o loop
                case 2: // Se o usuário digitou o número 2
                    telaListagem(); // Chama o método secundário que gerencia a exibição da lista
                    break; // Sai do switch
                case 3: // Se o usuário digitou o número 3
                    System.out.println("Encerrando o sistema..."); // Exibe a mensagem de despedida
                    break; // Sai do switch, o que fará o 'while' falhar e o programa fechar
                default: // Caso o número não seja 1, 2 ou 3 (ou tenha dado erro na conversão e virou 0)
                    System.out.println("Opcao invalida. Tente novamente."); // Alerta o usuário do erro
            } // Fim do bloco switch
        } while (opcao != 3); // O laço "do" continuará se repetindo infinitamente até que a opção seja
                              // exatamente 3
    } // Fim do método iniciar

    private void telaCadastro() { // Método privado dedicado exclusivamente a cadastrar um produto
        System.out.print("Digite o nome do produto: "); // Pede o nome
        String nome = scanner.nextLine(); // Lê a frase inteira digitada e salva na variável String 'nome'
        System.out.print("Digite o preco do produto: "); // Pede o preço

        try { // Inicia proteção contra erros de digitação numérica no preço
            double preco = Double.parseDouble(scanner.nextLine()); // Lê a digitação e converte para número decimal
                                                                   // (double)
            controller.cadastrarProduto(nome, preco); // Envia os dados limpos e validados para o Controller salvar
            System.out.println("Produto cadastrado com sucesso!"); // Dá um feedback visual positivo para o usuário
        } catch (NumberFormatException e) { // Se o usuário digitar "dez" em vez de "10", captura o erro
            System.out.println("Erro: Digite um valor numerico valido para o preco."); // Exibe aviso amigável sem
                                                                                       // fechar o app
        } // Fim do try-catch do preço
    } // Fim do método telaCadastro

    private void telaListagem() { // Método privado dedicado exclusivamente a mostrar os produtos cadastrados
        List<Produto> produtos = controller.listarProdutos(); // Pede ao Controller a lista atualizada de produtos
        if (produtos.isEmpty()) { // Verifica se o tamanho da lista é zero (vazia)
            System.out.println("Nenhum produto cadastrado no momento."); // Se estiver vazia, avisa o usuário
        } else { // Se existir pelo menos um item na lista
            System.out.println("\n--- Lista de Produtos ---"); // Imprime o cabeçalho da listagem
            for (Produto p : produtos) { // Estrutura de repetição (for-each) que percorre cada 'Produto' da lista,
                                         // chamando de 'p'
                System.out.println(p.toString()); // Chama o toString() do objeto Produto e o imprime na tela
            } // Fim do for-each
        } // Fim do else
    } // Fim do método telaListagem
} // Fim da classe ProdutoView