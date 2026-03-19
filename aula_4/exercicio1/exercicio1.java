package software_dev.aula_4.exercicio1;

public class exercicio1 {
    public static void main(String[] args) {
        
        int numero = 1;

        switch (numero) {
            case 1:
                System.out.println("Java");
                break;
            case 2:
                System.out.println("Python");
                break;
            case 3:
                System.out.println("JavaScript");
                break;
            
            default:
                System.out.println("Linguagem não encontrada");
                break;
        }
        
    }
    
}
