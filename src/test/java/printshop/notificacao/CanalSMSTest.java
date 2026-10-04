package printshop.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalSMSTest {

    @Test
    void deveEnviarPorSMS() {
        ICanalEnvio canal = new CanalSMS();
        assertEquals("SMS enviado: Pedido pronto", canal.enviar("Pedido pronto"));
    }
}
