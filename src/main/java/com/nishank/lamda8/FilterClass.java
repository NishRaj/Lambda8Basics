package com.nishank.lamda8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FilterClass {
    public static void main(String[] args){
       FilterClass filters = new FilterClass();
       List<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,9,11, 13, 15,20,21));
        List<Integer> oddList = filters.filterEvenNumbers(numList, (num) -> num%2 !=0);
        oddList.forEach(p -> System.out.print(p + "--"));
    }
    public List<Integer> filterEvenNumbers(List<Integer> numberList, Predicate<Integer> predicate){
        List<Integer> oddList = new ArrayList<Integer>();
        for (Integer num : numberList){
            if(predicate.test(num))
                oddList.add(num);
        }
        return oddList;
    }
}
