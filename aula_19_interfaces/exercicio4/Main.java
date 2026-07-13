package software_dev.aula_19_interfaces.exercicio4;

import java.util.ArrayList;

interface Transportavel{
    void mostrarStatus();
    void realizarEntrega();
}

class Caminhao implements Transportavel{
    @Override
    public void mostrarStatus() {
        System.out.println("Caminhão em rota de entrega...");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega realizada por caminhão...");
    }
}

class DroneEntrega implements Transportavel{
    @Override
    public void mostrarStatus() {
        System.out.println("Drone em rota de entrega...");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega realizada por drone...");
    }
}

class MotoEntrega implements Transportavel{
    @Override
    public void mostrarStatus() {
        System.out.println("Moto em rota de entrega...");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega realizada por moto...");
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Transportavel> transportes = new ArrayList<>();
        transportes.add(new Caminhao());
        transportes.add(new DroneEntrega());
        transportes.add(new MotoEntrega());

        for (Transportavel transporte : transportes) {
            transporte.mostrarStatus();
            transporte.realizarEntrega();
        }
    }
}