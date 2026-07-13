package software_dev.aula_13.lista_exercicios.exercicio1;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    void validarIdade() {
        if (idade < 0) {
            System.out.println("Erro: Idade não pode ser negativa.");
        } else {
            System.out.println("Idade válida.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Bob", -5);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.validarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.validarIdade();
    }
}

