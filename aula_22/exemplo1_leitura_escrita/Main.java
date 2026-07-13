import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("dados.txt");
            if (arquivo.createNewFile()) {
                System.out.println(
                        "Arquivo criado!");
            } else {
                System.out.println(
                        "Arquivo já existe!");
            }
        } catch (IOException e) {
            System.out.println(
                    "Erro ao criar arquivo!");
        }
    }
}