package com.example.glassbaren.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        //Calls the constructor from the customerservice class
        super(message);
    }
}
