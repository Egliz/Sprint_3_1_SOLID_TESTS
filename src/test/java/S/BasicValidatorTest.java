package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicValidatorTest {

    @Test
    //metodo_condicion_resultado
    void stringValidator_isNull_throwsException(){
       assertThrows(IllegalArgumentException.class, ()  -> {
           BasicValidator.stringValidator(null);});
       }
    }
