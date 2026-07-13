package controller;

import model.Produto; // Importa a classe Produto para poder criar objetos do tipo Produto e manipular a lista de produtos
import java.io.*; // Importa todas as classes de entrada e saída (necessárias para manipular arquivos)
import java.util.ArrayList; // Importa a classe ArrayList para criar listas com tamanho dinâmico
import java.util.List; // Importa a interface List padrão do Java

public class ProdutoController { // Declara a classe controladora que fará a ponte entre os dados e as telas
    private List<Produto> produtos; // Declara uma lista privada para manter os produtos carregados na memória RAM
    private final String ARQUIVO = "produtos.dat"; // Define uma constante com o nome exato do arquivo de dados

    public ProdutoController() { // Construtor do Controller, executado no momento em que ele é instanciado
        this.produtos = new ArrayList<>(); // Inicializa a variável 'produtos' como uma nova ArrayList vazia
        carregarDados(); // Chama imediatamente o método que tenta ler o arquivo para restaurar dados
                         // antigos
    } // Fim do construtor

    public void cadastrarProduto(String nome, double preco) { // Método acionado pela View para criar um produto
        Produto novoProduto = new Produto(nome, preco); // Instancia um novo objeto Produto usando os dados fornecidos
        produtos.add(novoProduto); // Adiciona este novo objeto dentro da nossa ArrayList em memória
        salvarDados(); // Sempre que adicionar um novo produto, chama o método para atualizar o arquivo
                       // no disco
    } // Fim do método cadastrarProduto

    public List<Produto> listarProdutos() { // Método que a View chama quando quer exibir os itens
        return produtos; // Apenas devolve a lista completa de produtos armazenada na memória
    } // Fim do método listarProdutos

    private void salvarDados() { // Método privado (só o Controller usa) para gravar a lista no arquivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) { // Tenta abrir o arquivo
                                                                                               // em modo de escrita de
                                                                                               // objetos (cria se não
                                                                                               // existir)
            oos.writeObject(produtos); // Pega a lista inteira de produtos e a "escreve" de uma vez só no arquivo
        } catch (IOException e) { // Se der algum erro (ex: falta de permissão na pasta), captura a exceção
            System.out.println("Erro ao salvar os produtos: " + e.getMessage()); // Exibe no console a mensagem de erro
        } // Fim do bloco try-catch de salvamento
    } // Fim do método salvarDados

    @SuppressWarnings("unchecked") // Anotação para esconder avisos do compilador sobre a conversão de tipos abaixo
    private void carregarDados() { // Método privado para ler os dados do arquivo ao abrir o programa
        File arquivo = new File(ARQUIVO); // Cria um objeto File para verificar propriedades do arquivo no disco
        if (arquivo.exists()) { // Verifica se o arquivo 'produtos.dat' já foi criado anteriormente
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))) { // Abre o arquivo em
                                                                                                // modo de leitura de
                                                                                                // objetos
                produtos = (List<Produto>) ois.readObject(); // Lê os bytes do arquivo, converte de volta para
                                                             // List<Produto> e joga na memória
            } catch (IOException | ClassNotFoundException e) { // Captura erros de leitura ou se a classe Produto não
                                                               // existir mais
                System.out.println("Erro ao carregar os produtos: " + e.getMessage()); // Imprime o erro caso não
                                                                                       // consiga ler
            } // Fim do bloco try-catch de leitura
        } // Fim da verificação 'if'
    } // Fim do método carregarDados
} // Fim da classe ProdutoController