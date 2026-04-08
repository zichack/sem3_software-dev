package software_dev.aula_11.exercicio8;

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        setNota(nota);;
    }

    public Aluno() {
        this.nome = "";
        this.nota = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Erro! A nota deve estar entre 0 e 10.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        System.out.println("Nome: " + aluno.getNome());
        aluno.setNota(8.5);
        System.out.println("Nota: " + aluno.getNota());
    }
}
