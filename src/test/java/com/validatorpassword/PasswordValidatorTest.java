package com.validatorpassword;

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

//    @Test
//    void isValid_returnsFalse_whenPasswordIsNull() {
//        assertFalse(passwordValidator.IsValid(null));
//    }
//
//    @Test
//    void isValid_returnsFalse_whenPasswordHasSpaces() {
//        assertFalse(passwordValidator.IsValid("password with spaces"));
//    }
//    @Test
//    void isValid_returnsFalse_whenPasswordHasNoDigit() {
//        assertFalse(passwordValidator.isValid("NoDigitHere!"));
//    }
//
//    @Test
//    void isValid_returnsFalse_whenPasswordHasNoLowercase() {
//        assertFalse(passwordValidator.isValid("NOLOWERCASE123!"));
//    }
//
//    @Test
//    void isValid_returnsFalse_whenPasswordHasNoUppercase() {
//        assertFalse(passwordValidator.isValid("nouppercase123!"));
//    }
//
//    @Test
//    void isValid_returnsFalse_whenPasswordHasNoSpecialChar() {
//        assertFalse(passwordValidator.isValid("NoSpecialChar123"));
//    }
//
//    @Test
//    void isValid_returnsFalse_whenPasswordHasRepeatedChars() {
//        assertFalse(passwordValidator.isValid("Repeated123!"));
//    }
//
//    @Test
//    void isValid_returnsTrue_whenPasswordIsValid() {
//        assertTrue(passwordValidator.isValid("Valid123!"));
//    }
}
