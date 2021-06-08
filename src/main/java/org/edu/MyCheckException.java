package org.edu;

public class MyCheckException extends Exception{
    private final int number;
    public int getNumber(){return number;}
    public MyCheckException(String message, int num){
        super(message + " Value - " + num );
        number=num;
    }
}
