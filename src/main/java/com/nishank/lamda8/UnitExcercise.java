package com.nishank.lamda8;

import com.nishank.bean.Person;
import com.nishank.functionalInterface.Condition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExcercise {

    public static void main(String[] args) {
        List<Person> peopleList = Arrays.asList(new Person("Nishank", "Rajvanshi", 40),
                new Person("neha", "gupta", 37), new Person("Abhyuday", "rajvanshi", 9));
              Collections.sort(peopleList, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
              printAllConditionally(peopleList,(Person p) -> true,(Person p) -> System.out.println(p));
              printAllConditionally(peopleList,(Person p) -> p.getFirstName().startsWith("A"),(Person p) -> System.out.println(p.getFirstName()));

    }

   public static void printAllConditionally(List<Person> peopleList, Predicate<Person> predicate, Consumer<Person> consumer) {
            for (Person person :peopleList){
                if(predicate.test(person))
                    consumer.accept(person);
            }
     }

}
