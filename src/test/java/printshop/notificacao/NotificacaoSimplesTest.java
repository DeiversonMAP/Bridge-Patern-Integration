package printshop.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSimplesTest {

    @Test
    void deveEnviarNotificacaoSimplesPorEmail() {
        Notificacao notificacao = new NotificacaoSimples(new CanalEmail());
        assertEquals("E-mail enviado: Pedido pronto", notificacao.enviar("Pedido pronto"));
    }

    @Test
    void deveEnviarNotificacaoSimplesPorSMS() {
        Notificacao notificacao = new NotificacaoSimples(new CanalSMS());
        assertEquals("SMS enviado: Pedido pronto", notificacao.enviar("Pedido pronto"));
    }
}
