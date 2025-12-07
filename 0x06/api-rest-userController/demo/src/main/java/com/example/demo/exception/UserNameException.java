package com.example.demo.exception;

public class UserNameException extends RuntimeException {


    private static final long serialVersionUID = 1L;

    public UserNameException(String message) {
        super(message);
    }


}