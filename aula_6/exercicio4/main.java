package software_dev.aula_6.exercicio4;

class universidade {
    String nome;
    String cidade;

    void exibirUniversidade(){
    System.out.println("Nome da universidade: " + nome);
    System.out.println("Cidade: " + cidade);
    }
}


class professor {
    String nome;
    String disciplina;

    void exibirProfessor(){
    System.out.println("Nome do professor: " + nome);
    System.out.println("Disciplina: " + disciplina);
    }
}

public class Main {
public static void main(String[] args){
    universidade uni = new universidade();
    professor prof = new professor();

    uni.nome = "Universidade Estadual de Londrina";
    uni.cidade = "Londrina";

    prof.nome = "Dr. Silva";
    prof.disciplina = "Matemática";

    uni.exibirUniversidade();
    prof.exibirProfessor();
}
}


