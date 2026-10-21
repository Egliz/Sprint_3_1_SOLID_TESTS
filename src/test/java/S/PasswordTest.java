package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordTest {

    @Test
    //metodo_condicion_resultado

    void passwordValidator_withoutUpperLetter_throwsException(){
        assertThrows(IllegalArgumentException.class, () -> { Password.passwordValidator("password123");});
    }

    @Test
    void passwordValidator_withoutNumber_throwsException(){
        assertThrows(IllegalArgumentException.class, () -> { Password.passwordValidator("password");});

    }
}
