import java.util.ArrayList;

interface Notificacao{
    void enviarMensagem();
}

class Email implements Notificacao{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando email...");
    }
}

class SMS implements Notificacao{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando SMS...");
    }
}

class Whatsapp implements Notificacao{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo WhatsApp...");
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());
        notificacoes.add(new Whatsapp());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarMensagem();
        }
    }
}