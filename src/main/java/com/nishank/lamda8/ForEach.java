package com.nishank.lamda8;

import com.nishank.bean.Person;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String [] args){
        List<Person> peopleList = Arrays.asList(new Person("Nishank", "Rajvanshi", 40),
                new Person("neha", "gupta", 37), new Person("Abhyuday", "rajvanshi", 9));
        /*
         It can run in parallel as we don't care about order. These are called internal iterators.
         */
        peopleList.forEach(p -> System.out.println(p));
    }
}
