package printshop.notificacao;

public class CanalSMS implements ICanalEnvio {
    @Override
    public String enviar(String mensagem) {
        return "SMS enviado: " + mensagem;
    }
}
