package Regex;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {

    @Test
    public void testThatEmailValidationWorks(){

            String email = "p.nwakwo@native.semicolon.africa";

            boolean actual = Regex.emailValidation(email);

            assertTrue(actual);

    }


    @Test
    public void testThatPasswordValidationWorks(){

        String password= "dan@12347";
        boolean actual = Regex.passwordValidation(password);

        assertTrue(actual);
    }

    @Test
    public void testThatPasswordWithSpacewillFail(){

        String password = "Java Code@1";
        boolean actual = Regex.passwordValidation(password);
        assertFalse(actual);
    }

    @Test
    public void testThatPasswordWithSpacewillFail2(){

        String password = "Welcome 123$";
        boolean actual = Regex.passwordValidation(password);
        assertFalse(actual);
    }
}