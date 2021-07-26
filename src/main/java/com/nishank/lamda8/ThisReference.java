package com.nishank.lamda8;

import java.util.function.Consumer;

public class ThisReference {

    public static void main(String [] args){
        //System.out.println(this);
        ThisReference thisReference = new ThisReference();
        int x = 20;
        thisReference.process(10, (i) -> {
            System.out.println(i + x);
            /*
            Lambda expression does not change "this"
             */
            //System.out.println(this);
        });
        thisReference.execute();
    }
    public void process(int num, Consumer<Integer> consumer){
        consumer.accept(num);
    }
    public void execute(){
        process(10, i -> {
            System.out.println(i);
            System.out.println(this);
        });
    }
}
