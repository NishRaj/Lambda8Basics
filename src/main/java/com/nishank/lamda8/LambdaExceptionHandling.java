package com.nishank.lamda8;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int key = 0;
        processNumbers(nums, key,wrapperLambda((v,k)-> System.out.println(v/k)));
    }
    static void processNumbers(int[] nums , int key, BiConsumer<Integer,Integer> consumer){
        for (int num : nums){
            consumer.accept(num,key);
        }
    }
    static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer){
        return (v,k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException ex) {
                ex.printStackTrace();
            }
        };
    }
}
