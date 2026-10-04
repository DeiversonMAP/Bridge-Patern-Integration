package printshop.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalPushTest {

    @Test
    void deveEnviarPorPush() {
        ICanalEnvio canal = new CanalPush();
        assertEquals("Push enviado: Pedido pronto", canal.enviar("Pedido pronto"));
    }
}
