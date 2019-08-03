package com.stackroute.example.lambda;

public class Main {
    public static void main(String[] args) {
        // traditional way
        new Thread(new RunnableDemo()).start();
        // by anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous class");
            }
        });
        // by lambda expression
        new Thread(()->
        {
            System.out.println("running");
        }
        ).start();
    }
}
