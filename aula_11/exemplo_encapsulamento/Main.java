package software_dev.aula_11.exemplo_encapsulamento;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
            this.nome = "";
            this.idade = 0;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
    
}

public class Main{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.setIdade(1);
    }
}