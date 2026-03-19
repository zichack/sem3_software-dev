package software_dev.aula_4.exemplo_vetor1;

public class exemplo_vetor1 {
    public static void main(String[] args){

        int[] notas = new int[5];

        notas[0] = 7;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 6;
        notas[4] = 10;

        for (int i = 0; i < 5; i++){
            System.out.println("Nota: " + notas[i]);
        }
    }
}
