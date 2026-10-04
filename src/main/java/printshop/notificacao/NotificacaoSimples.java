package printshop.notificacao;

public class NotificacaoSimples extends Notificacao {

    public NotificacaoSimples(ICanalEnvio canal) {
        super(canal);
    }

    @Override
    public String enviar(String mensagem) {
        return canal.enviar(mensagem);
    }
}
