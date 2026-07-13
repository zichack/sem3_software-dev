package software_dev.aula_22.exemplo4_leitura_escrita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("dados.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(
                    "Erro ao ler arquivo!");
        }
    }
}
