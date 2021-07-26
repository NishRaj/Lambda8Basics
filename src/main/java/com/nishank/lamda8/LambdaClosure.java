package com.nishank.lamda8;

import java.util.function.Consumer;

public class LambdaClosure {

    public static void main(String[] args){
        int i =10;
        int b = 20;
        doProcess(10,(k) -> System.out.println(k+ b));
    }
   static void doProcess(int someNumber, Consumer<Integer> consumer){
       consumer.accept(someNumber);
    }
}
