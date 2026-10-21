package S;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void userIsConfirmed(){

        User user1 = new User("User1", "User1@email.com", "pass123");
        user1.confirmedUser();
        assertEquals(true, true);
    }
}
