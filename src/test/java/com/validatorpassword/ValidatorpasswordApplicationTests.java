package com.validatorpassword;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.validatorpassword.service.ServiceValidator;

@SpringBootTest
class ValidatorpasswordApplicationTests {

	private final ServiceValidator serviceValidator = new ServiceValidator();

	 @Test
    void testEmptyPassword() {
        assertFalse(serviceValidator.isValid(""));
    }

    @Test
    void testShortPassword() {
        assertFalse(serviceValidator.isValid("aa"));
    }

    @Test
    void testNoDigit() {
        assertFalse(serviceValidator.isValid("AAAbbbCc"));
    }

    @Test
    void testRepetitiveCharacters() {
        assertFalse(serviceValidator.isValid("AbTp9!foo"));
    }

    @Test
    void testRepetitiveCharactersAtEnd() {
        assertFalse(serviceValidator.isValid("AbTp9!foA"));
    }

    @Test
    void testPasswordWithSpace() {
        assertFalse(serviceValidator.isValid("AbTp9 fok"));
    }

    @Test
    void testValidPassword() {
        assertTrue(serviceValidator.isValid("AbTp9!fok"));
    }
}
