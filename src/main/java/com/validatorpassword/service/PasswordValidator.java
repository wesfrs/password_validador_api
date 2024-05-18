package com.validatorpassword.service;
import com.validatorpassword.Password;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;


@Service
public class PasswordValidator {

    public PasswordValidator() {
    }

    public boolean IsValid(Password password) {

        Pattern lowerCasePatt = Pattern.compile("[a-z]");
        Pattern upperCasePatt = Pattern.compile("[A-Z]");
        Pattern digitPatt = Pattern.compile("[0-9]");
        Pattern specialCharPatt = Pattern.compile("[!@#$%^&*()-+]");
        Pattern spacePatt = Pattern.compile("\\s");

        System.out.println(password);
        System.out.println(password.length());

        return  password.length() >= 9 &&
                lowerCasePatt.matcher(password.getPassword()).find() &&
                upperCasePatt.matcher(password.getPassword()).find() &&
                digitPatt.matcher(password.getPassword()).find() &&
                specialCharPatt.matcher(password.getPassword()).find() &&
                !spacePatt.matcher(password.getPassword()).find() &&
                notContainsRepeatedCaracters(password.getPassword());
    }

    private boolean notContainsRepeatedCaracters(String password) {
        boolean[] caracteres = new boolean[256];

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // Se o caractere já foi encontrado antes, retorna true
            if (caracteres[c]) {
                return false;
            }

            // Marca o caractere atual como encontrado
            caracteres[c] = true;
        }
        return true;
    }
}