package software_dev.aula_17.exercicio3_wrapper;

public class Main {

    public static void main(String[] args) {
        
        String preco = "199.90";

        double valor = Double.parseDouble(preco);

        System.out.println(valor - (valor * 0.1));
    }
    
}
