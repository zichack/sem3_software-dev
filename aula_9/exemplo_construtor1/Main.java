package exemplo_construtor1;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando a instância da classe Pessoa
        Pessoa p = new Pessoa("Maria", 25);
        
        // Exibindo os dados no console para testar
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
    }
}