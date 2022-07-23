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
                new Person("Neha", "Gupta", 37), new Person("Abhyuday", "Rajvanshi", 9), new Person("Nirvi","Rajvanshi",1));
              Collections.sort(peopleList, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
              printAllConditionally(peopleList,p -> true,p -> System.out.println(p));
              printAllConditionally(peopleList, p -> p.getFirstName().startsWith("A"),p -> System.out.println(p.getFirstName()));
              Predicate<Person> lengthOfPerson = p -> p.getLengthOfPerson() > 14;
              Predicate<Person> startsWithN = p -> p.getFirstName().startsWith("N");
              /*
              / We can even combine Predicate using and(), or() And xor() logical functions
              // for example to find names, which starts with J and four letters long, you
              // can pass combination of two Predicate
               */
              printNames(peopleList,lengthOfPerson.and(startsWithN));

    }

   public static void printAllConditionally(List<Person> peopleList, Predicate<Person> predicate, Consumer<Person> consumer) {
            for (Person person :peopleList){
                if(predicate.test(person))
                    consumer.accept(person);
            }
     }
     /*
     Write a method that print names which starts with N and are more than 14 letters.
      */
    public static void printNames(List<Person> peopleList, Predicate<Person> p){
        peopleList.stream().filter(p).forEach(person -> System.out.println(person));
    }

}
