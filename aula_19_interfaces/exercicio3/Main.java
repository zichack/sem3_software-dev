package software_dev.aula_19_interfaces.exercicio3;

interface Inteligente{
    void executarAcao();
}

class LampadaInteligente implements Inteligente{
    @Override
    public void executarAcao(){
        System.out.println("Lâmpada ligada...");
    }
}

class Alexa implements Inteligente{
    @Override
    public void executarAcao(){
        System.out.println("Alexa respondendo...");
    }
}

class ArCondicionado implements Inteligente{
    @Override
    public void executarAcao(){
        System.out.println("Temperatura ajustada...");
    }
}

public class Main{
    public static void main(String[] args) {
        Inteligente lampada = new LampadaInteligente();
        Inteligente alexa = new Alexa();
        Inteligente arCondicionado = new ArCondicionado();

        lampada.executarAcao();
        alexa.executarAcao();
        arCondicionado.executarAcao();
    }
}