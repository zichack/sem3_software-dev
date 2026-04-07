package software_dev.aula_10.exercicio_passada2;

class Funcionario{
    String nome;
    double salario;

    public Funcionario(){};

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
}

public class Main{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Mateus", 3500.00);
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Salário: " + (funcionario1.salario * 0.10 + funcionario1.salario));
    }
}
