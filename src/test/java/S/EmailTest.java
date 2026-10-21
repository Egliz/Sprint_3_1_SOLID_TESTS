package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void emailValidator_containsAtSign_doesNotThrowsException() {
        assertDoesNotThrow(() -> {
            Email.emailValidator("Email@atSign.com");});
    }

    @Test
    void emailValidator_noContainsDot_ThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {Email.emailValidator("Email@dotCom");});
    }
}
