package com.validatorpassword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validatorpassword.service.ServiceValidator;

@RestController
@RequestMapping("/validator")
public class ControllerValidator {

    @Autowired
    private ServiceValidator serviceValidator;

    @PostMapping("/validate")
    public ResponseEntity<Boolean> validatePassword(@RequestBody String password) {
        boolean isValid = serviceValidator.isValid(password);
        return ResponseEntity.ok(isValid);
    }
}
