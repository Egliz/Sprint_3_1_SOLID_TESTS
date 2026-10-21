package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class EmailTest {

    @Test
        //metodo_condicion_resultado
    void emailValidator_containsAtSign_doesNotThrowsException() {
        assertDoesNotThrow(() -> {
            Email.emailValidator("Email@atSign.com");});
    }

    void
}
