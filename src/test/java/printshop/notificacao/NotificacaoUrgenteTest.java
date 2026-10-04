package printshop.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoUrgenteTest {

    @Test
    void deveEnviarNotificacaoUrgentePorPush() {
        Notificacao notificacao = new NotificacaoUrgente(new CanalPush());
        assertEquals("Push enviado: [URGENTE] Atraso na producao", notificacao.enviar("Atraso na producao"));
    }

    @Test
    void deveEnviarNotificacaoUrgentePorEmail() {
        Notificacao notificacao = new NotificacaoUrgente(new CanalEmail());
        assertEquals("E-mail enviado: [URGENTE] Atraso na producao", notificacao.enviar("Atraso na producao"));
    }
}
