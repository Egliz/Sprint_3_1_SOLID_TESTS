package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordTest {

    @Test
    //metodo_condicion_resultado

    void passwordValidator_withoutUpperLetter_throwsException(){
        assertThrows(IllegalArgumentException.class, () -> { Password.passwordValidator("password123");});
    }

}
