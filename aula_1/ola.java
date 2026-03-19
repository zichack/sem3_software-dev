package software_dev.aula_1;
import java.util.Scanner;
public class ola{
    public static void main(String args[]){
        /*String texto = "Disciplina - Desenvolvimento de Software";
        int ano = 2024;*/
        //System.out.print(texto);
        System.out.println("Universidade");
       /*System.out.print(ano);
        System.out.println();
        System.out.print("Olá\nMaria");
        System.out.println("Olá" + "Maria");*/

        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        //System.out.print(numero);
        System.out.println("Você digitou: " + numero);
        entrada.close();
    }
};