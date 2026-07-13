package software_dev.aula_16.exercicio2;

// exemplo de "final" em Java, que não pode atribuir um novo valor a uma constante depois de sua inicialização. 
// com isso, o código dará erro em sua compilação.

public class Main {

    public static void main(String[] args){

        final double PI = 3.14;

        System.out.println(PI);

        double raio = 10;
        PI = 10; // Esta linha causará um erro de compilação
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }
    
}
