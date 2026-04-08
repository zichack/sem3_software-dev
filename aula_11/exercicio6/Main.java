package software_dev.aula_11.exercicio6;

class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario + (salario * 0.10); // Aumenta o salário em 10%
    }

    public Funcionario() {
        this.nome = "";
        this.salario = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido.");
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2000);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + (funcionario.getSalario()));
    }
}