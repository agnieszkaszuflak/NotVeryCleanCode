package confirmationLetter;

import domain.Client;
import record.service.impl.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClientTest {

    private Client client;

    @Test
    void test_is_balanced() {
        client.setCounterTransfer(Constants.TRUE);
        assertTrue(client.isBalanced());
    }

    @Test
    void test_is_not_balanced() {
        client.setCounterTransfer(Constants.FALSE);
        assertFalse(client.isBalanced());
    }

    @Test
    void test_other() {
        client.setCounterTransfer("WTF!");
        assertFalse(client.isBalanced());
    }


} 