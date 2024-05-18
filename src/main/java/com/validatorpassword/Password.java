package com.validatorpassword;

import java.io.Serializable;

public class Password implements Serializable {
    private String password;

    Password() {
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
