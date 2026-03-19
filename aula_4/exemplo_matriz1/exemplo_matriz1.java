package software_dev.aula_4.exemplo_matriz1;

public class exemplo_matriz1 {
    public static void main(String[] args){

        int[][] matriz = new int[3][3];

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
