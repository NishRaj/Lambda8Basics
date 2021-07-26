package com.nishank.functionalInterface;

import com.nishank.bean.Person;

import java.util.List;

@FunctionalInterface
public interface Condition {
     boolean test(Person person);
}
