package software_dev.aula_9.exercicio1_construtor;

class Aluno{
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mateus", 27);
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
    }
}