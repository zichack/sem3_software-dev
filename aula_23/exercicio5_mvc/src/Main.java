import view.ProdutoView; // Ensina o Main onde está a View

public class Main { // Declara a classe principal da aplicação
    public static void main(String[] args) { // Declara o método estático principal, que é a porta de entrada que a JVM
                                             // procura para rodar
        ProdutoView view = new ProdutoView(); // Instancia a View. Como vimos no construtor dela, ela mesma já se
                                              // encarrega de instanciar o Controller
        view.iniciar(); // Chama o método 'iniciar' da View, que abre o menu interativo no terminal e
                        // "prende" o programa rodando
    } // Fim do método main
} // Fim da classe Main