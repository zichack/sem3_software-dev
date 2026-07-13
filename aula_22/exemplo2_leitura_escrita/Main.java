package software_dev.aula_22.exemplo2_leitura_escrita;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dados.txt");
            fw.write("Olá Mundo!");
            fw.close();
            System.out.println("Arquivo salvo!");
        } catch (IOException e) {
            System.out.println(
                    "Erro ao escrever!");
        }
    }
}