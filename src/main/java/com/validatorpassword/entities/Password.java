package com.validatorpassword.entities;

public class Password {
    private String password;

    public Password() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int length() {
        return password.length();
    }
}
