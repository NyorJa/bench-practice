package com.company.lambda;

import java.util.function.Function;

public class SampleFunction {
    Function<Person, Integer> getPersonAge = Person::getAge;
}
