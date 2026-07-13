package software_dev.aula_23.exercicio1_seralizacao;

import java.util.ArrayList;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class Aluno implements Serializable {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", 20));
        alunos.add(new Aluno("Maria", 22));
        alunos.add(new Aluno("Pedro", 19));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alunos.dat"))) {
            oos.writeObject(alunos);
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}