package com.loss.exception;


public class EmployeeNotfoundException extends RuntimeException{

    public EmployeeNotfoundException(String message){
        super(message);
    }
}