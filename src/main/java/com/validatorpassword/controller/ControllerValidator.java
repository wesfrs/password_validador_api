package com.validatorpassword.controller;

import com.validatorpassword.entities.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validatorpassword.service.PasswordValidator;

@RestController
@RequestMapping("/password_validador_api")
public class ControllerValidator {

    @Autowired
    private PasswordValidator passwordValidator;

    private

    @PostMapping("/validate_password") ResponseEntity<Boolean> validatePassword(@RequestBody Password password) {
        boolean isValid = passwordValidator.IsValid(password);
        return ResponseEntity.ok(isValid);
    }
}
