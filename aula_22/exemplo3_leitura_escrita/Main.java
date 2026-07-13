package software_dev.aula_22.exemplo3_leitura_escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("dados.txt"));
            bw.write("Maria");
            bw.newLine();
            bw.write("Notebook");
            bw.newLine();
            bw.write("R$ 3000");
            bw.close();
            System.out.println("Dados salvos!");
        } catch (IOException e) {
            System.out.println(
                    "Erro ao salvar!");
        }
    }
}