package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    void testThrownewIllegalArrgeument(){
        assertThrows(IllegalArgumentException.class, ()->UserValidator.isValidUsername(" "));
                assertThrows(IllegalArgumentException.class, ()->UserValidator.isValidUsername(""));

                        assertThrows(IllegalArgumentException.class, ()->UserValidator.isValidUsername(null));

    }
    @Test
    void testValidLength(){
        assertTrue(UserValidator.isValidUsername("MARIOS"));
                assertTrue(UserValidator.isValidUsername("MARIOSas"));
                        assertTrue(UserValidator.isValidUsername("masdad asd "));


    }
    @Test
    void TestInvalidLength(){
        assertFalse(UserValidator.isValidUsername("ma"));
                assertFalse(UserValidator.isValidUsername("mario"));
                        assertFalse(UserValidator.isValidUsername("MARIOSHENOUDAAAAA"));


        
    }
}
