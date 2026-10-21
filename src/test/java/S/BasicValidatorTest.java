package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicValidatorTest {

    @Test
    //metodo_condicion_resultado
    void stringValidator_stringIsNull_throwsException(){
       assertThrows(IllegalArgumentException.class, ()  -> {
           BasicValidator.stringValidator(null);});
       }

       @Test
       void stringValidator_stringIsBlank_throwsException(){
           assertThrows(IllegalArgumentException.class, ()  -> {
               BasicValidator.stringValidator(" ");});
       }
    }
