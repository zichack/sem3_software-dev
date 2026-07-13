package software_dev.aula_13.lista_exercicios.exercicio6;

// o erro aqui é que o construtor da classe Aluno não está atribuindo corretamente o valor do parâmetro nome ao atributo nome da classe, o que resulta em um nome nulo para os objetos criados a partir dessa classe.
class Aluno {

    //correção

    String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos");
        Aluno aluno2 = new Aluno("Maria");

        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.println("Aluno 2: " + aluno2.getNome());
    }
}
