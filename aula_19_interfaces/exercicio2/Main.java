package software_dev.aula_19_interfaces.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

interface Registravel{
    void registrarEntrada();
}

class Gerente implements Registravel{
    @Override
    public void registrarEntrada() {
        System.out.println("Gerente registrou sua entrada.");
    }
}

class Desenvolvedor implements Registravel{
    @Override
    public void registrarEntrada() {
        System.out.println("Desenvolvedor registrou sua entrada.");
    }
}

class Estagiario implements Registravel{
    @Override
    public void registrarEntrada() {
        System.out.println("Estagiário registrou sua entrada.");
    }
}

public class Main{
    public static void main(String[] args) {

        int totalRegistros = 0;

        ArrayList<Registravel> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente());
        funcionarios.add(new Desenvolvedor());
        funcionarios.add(new Estagiario());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do funcionário para registrar a entrada (1: Gerente, 2: Desenvolvedor, 3: Estagiário, 4: Sair): ");
        int escolha = 0;

        while(escolha != 4){
            escolha = scanner.nextInt();
            if(escolha >= 1 && escolha <= 3){
                funcionarios.get(escolha - 1).registrarEntrada();
                totalRegistros++;
            } else if(escolha != 4){
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        System.out.println("Total de registros de entrada: " + totalRegistros);
        scanner.close();
    }
}