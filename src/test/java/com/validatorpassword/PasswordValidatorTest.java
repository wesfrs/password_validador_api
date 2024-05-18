package com.validatorpassword;

import com.validatorpassword.entities.Password;
import com.validatorpassword.service.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void isValid_returnsFalse_whenPasswordIsTooShort() {
        Password password = new Password();
        password.setPassword("short");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsFalse_whenPasswordHasSpaces() {
        Password password = new Password();
        password.setPassword("aBcDeFgHi 123!");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsFalse_whenPasswordHasNoDigit() {
        Password password = new Password();
        password.setPassword("aBcDeFgHiJkL!");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsFalse_whenPasswordHasNoLowercase() {
        Password password = new Password();
        password.setPassword("ABCDEFG123!");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsFalse_whenPasswordHasNoUppercase() {
        Password password = new Password();
        password.setPassword("abcdefg123!");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsFalse_whenPasswordHasNoSpecialChar() {
        Password password = new Password();
        password.setPassword("aBcDeFgHiJkL123");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsFalse_whenPasswordHasRepeatedCharacter() {
        Password password = new Password();
        password.setPassword("aaBcDeFgHiJk123!");
        assertFalse(passwordValidator.IsValid(password));
    }

    @Test
    void isValid_returnsTrue_whenPasswordIsValid() {
        Password password = new Password();
        password.setPassword("aBcDeFgHiJk123!");
        assertTrue(passwordValidator.IsValid(password));
    }
}
