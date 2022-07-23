package com.nishank.lamda8;

import com.nishank.functionalInterface.Greeting;

public class Initializer {

    public static void main(String[] args){
        Initializer initialize = new Initializer();
        Greeting greet = () -> System.out.println("Hello World");
        //initialize.greeter(greet);
        greet.greeting();

    }
    public void greeter(Greeting greet){
        greet.greeting();
    }
}
