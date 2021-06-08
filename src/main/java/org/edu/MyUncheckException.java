package org.edu;

public class MyUncheckException extends RuntimeException {
    int number;
    public MyUncheckException(String message, int num){
            super(message + " " + num);
            number=num;
        }
}
