package software_dev.aula_6.exercicio1;

class exercicio1 {
    String nome;
    double preco;
    int quantidade;

    void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public static void main(String[] args) {
        exercicio1 produto1 = new exercicio1();
        exercicio1 produto2 = new exercicio1();
        produto1.nome = "Notebook";
        produto1.preco = 2500.00;
        produto1.quantidade = 10;

        produto2.nome = "Smartphone";
        produto2.preco = 1500.00;
        produto2.quantidade = 20;

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
    }
    
}
