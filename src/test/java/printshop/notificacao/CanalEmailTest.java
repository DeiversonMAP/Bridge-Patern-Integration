package printshop.notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalEmailTest {

    @Test
    void deveEnviarPorEmail() {
        ICanalEnvio canal = new CanalEmail();
        assertEquals("E-mail enviado: Pedido pronto", canal.enviar("Pedido pronto"));
    }
}
