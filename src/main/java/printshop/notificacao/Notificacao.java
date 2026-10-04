package printshop.notificacao;

public abstract class Notificacao {

    protected final ICanalEnvio canal;

    public Notificacao(ICanalEnvio canal) {
        this.canal = canal;
    }

    public abstract String enviar(String mensagem);
}
