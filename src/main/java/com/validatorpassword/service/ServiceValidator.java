package com.validatorpassword.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ServiceValidator {

    public boolean isValid(String password) {
        if (password == null) return false;
        password = password.replaceAll("\\s", "");

        if (password.length() < 9) return false;

        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        
        boolean hasSpecialChar = false;

        Set<Character> uniqueChars = new HashSet<>();
        String specialChars = "!@#$%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            else if (Character.isLowerCase(c)) hasLowercase = true;
            else if (Character.isUpperCase(c)) hasUppercase = true;
            else if (specialChars.indexOf(c) >= 0) hasSpecialChar = true;

            if (!uniqueChars.add(c)) return false;
        }

        return hasDigit && hasLowercase && hasUppercase && hasSpecialChar;
    }
}
