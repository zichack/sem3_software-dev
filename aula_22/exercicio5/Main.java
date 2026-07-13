package software_dev.aula_22.exercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] aqrgs){
        Scanner sc = new Scanner(System.in);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("pedidos.txt", true));
            System.out.println("Cliente: ");
            String cliente = sc.nextLine();

            System.out.println("Produto: ");
            String produto = sc.nextLine();

            System.out.println("Valor do produto: ");
            double valor = sc.nextDouble();

            bw.write("Cliente: " + cliente);
            bw.newLine();

            bw.write("Produto: " + produto);
            bw.newLine();

            bw.write("Valor: " + valor);
            bw.newLine();

            bw.close();
            System.out.println("Pedido salvo!");

            System.out.println("========Leitura de arquivo.========");

            BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"));

            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Erro no sistema!");
        }
        sc.close();
    }
}
