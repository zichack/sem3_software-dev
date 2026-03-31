package software_dev.aula_8.exercicio1;

class Pessoa{
    String nome;
    int idade;
}

class Funcionario extends Pessoa{
    double salario;
}

public class Main{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "João";
        funcionario1.idade = 30;
        funcionario1.salario = 2500.0;

        System.out.println("Funcionário: " + funcionario1.nome);
        System.out.println("Idade: " + funcionario1.idade);
        System.out.println("Salário: R$" + funcionario1.salario);
    }
}