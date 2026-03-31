package software_dev.aula_8.relacionamento_classes;

// 1. Criando a Classe Pai (Superclasse)
class Pessoa {
    String nome;  // Atributo herdável [cite: 60]
    int idade;    // Atributo herdável [cite: 61]
}

// 2. Criando a Classe Filha (Subclasse)
class Aluno extends Pessoa {
    String curso; // Atributo específico do Aluno [cite: 69]
}

class Professor extends Pessoa {
    String disciplina; // Atributo específico do Professor [cite: 70]
}

// 3. Testando na prática
public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto 
        Aluno aluno1 = new Aluno(); 
        
        // Atribuindo valores aos campos herdados de Pessoa [cite: 82, 83]
        aluno1.nome = "Ana"; 
        aluno1.idade = 20;   
        
        // Atribuindo valor ao campo próprio de Aluno [cite: 84]
        aluno1.curso = "ADS"; 

        Professor prof1 = new Professor();
        prof1.nome = "Carlos";
        prof1.idade = 45;
        prof1.disciplina = "Programação OO";

        System.out.println("Aluno: " + aluno1.nome + " - Curso: " + aluno1.curso);
        System.out.println("Professor: " + prof1.nome + " - Disciplina: " + prof1.disciplina);
        
        // Exibindo os dados no console [cite: 85, 86, 87]
        System.out.println(aluno1.nome);  
        System.out.println(aluno1.idade); 
        System.out.println(aluno1.curso); 
    }
}