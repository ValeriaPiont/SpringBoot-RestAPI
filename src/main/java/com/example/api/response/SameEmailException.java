package com.example.api.response;

public class SameEmailException extends RuntimeException{
    public SameEmailException(String message) {
        super(message);
    }
}
