package software_dev.aula_11.exercicio1;

class Aluno{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(){
        this.nome = "";
        this.idade = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        System.out.println("Nome: " + aluno.getNome());
        aluno.setIdade(-5); // Tentativa de definir uma idade inválida
    }
}
