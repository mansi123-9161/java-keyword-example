package com.stackroute.example.exception;

public class MyException  extends Throwable{

    private String reason;
    public MyException(String reason)
    {
        super("MyException - " + reason);
        this.reason = reason;
    }
    private MyException()
    {
    }

    public String getReason()
    {
        return "MyException:getReason() - " + reason; // Prefixed with the method name to understand how printStackTrace() works.
    }
    @Override
    public String toString()
    {
        return "MyExceptio::toString() - " + reason; // Prefixed with the method name to understand how printStackTrace() works.
    }
}
