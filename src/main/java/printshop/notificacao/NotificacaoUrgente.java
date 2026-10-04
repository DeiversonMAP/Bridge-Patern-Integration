package printshop.notificacao;

public class NotificacaoUrgente extends Notificacao {

    public NotificacaoUrgente(ICanalEnvio canal) {
        super(canal);
    }

    @Override
    public String enviar(String mensagem) {
        return canal.enviar("[URGENTE] " + mensagem);
    }
}
