package software_dev.aula_20.exemplo1;

public class Main {

    public static void main(String[] args){
        try{
            int numero = 10/0;

            System.out.println(numero);
        } catch(ArithmeticException e){

            System.out.println("Erro, a divisão não pode ser por zero.");
        }
    }
}