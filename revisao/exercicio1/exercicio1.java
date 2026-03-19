package software_dev.revisao.exercicio1;

public class exercicio1 {
    static void zerarTemperaturas(double[] temperaturas, int posicao){
            temperaturas[posicao] = 0.0;
        }

    public static void main(String[] args){
        double[] valorTemperaturas = {7, 8.2, -4, -32.7, 41, -0.9};
        
        for(int i = 0; i < valorTemperaturas.length; i++){
            if(valorTemperaturas[i] <=0){
                zerarTemperaturas(valorTemperaturas, i);
            }
            else{
                System.out.println("Temperatura " + valorTemperaturas[i] + " não é menor ou igual a zero. Não será zerada.");
            }
            System.out.println("Temperatura deverá ser zerada. Nova temperatura: " + valorTemperaturas[i]);
        }
    }
}
