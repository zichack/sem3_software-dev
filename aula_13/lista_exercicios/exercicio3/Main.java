package software_dev.aula_13.lista_exercicios.exercicio3;

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void validarNota() {
        if (nota < 0 || nota > 10) {
            System.out.println("Erro: Nota deve estar entre 0 e 10.");
        } else {
            System.out.println("Nota válida.");
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 8.5);
        Aluno aluno2 = new Aluno("Maria", -3);
        Aluno aluno3 = new Aluno("João", 11);

        System.out.println(aluno1.getNome() + " tem nota " + aluno1.getNota());
        aluno1.validarNota();

        System.out.println(aluno2.getNome() + " tem nota " + aluno2.getNota());
        aluno2.validarNota();

        System.out.println(aluno3.getNome() + " tem nota " + aluno3.getNota());
        aluno3.validarNota();
    }
}
