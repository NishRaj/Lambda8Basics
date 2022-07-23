package com.nishank.lamda8;

public class RunnableLambda {

    public static void main(String[] args){
        Thread myRunnableThread = new Thread(() -> System.out.println("Running the thread"));
        myRunnableThread.start();
        System.out.println("In the main method");
    }

}
