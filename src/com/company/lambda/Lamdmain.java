package com.company.lambda;

import java.util.*;
import java.util.function.Function;

public class Lamdmain {
    public static void main(String[] args) {
/*
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpName = (p1, p2) -> p2.getName().compareTo(p1.getName());


        Function<Person, String> personName = Person::getName;
        Function<Person, Integer> personAge = Person::getAge;

        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
*/

        City cityA = new City("Iloilo");
        City cityB = new City("Manila");
        Person person1 = new Person("nyor", 12);
        Person person2 = new Person("rony", 12);


        Map<City, List<Person>> map = new HashMap<>();
        Map<City, List<Person>> map2 = new HashMap<>();

        for (City city: Arrays.asList(cityA, cityB, cityA)) {
/*            map.putIfAbsent(city, new ArrayList<>());
            map.get(city).add(person);*/

            map.computeIfAbsent(city, p -> new ArrayList<>()).add(person1);
        }

        for (City city : Arrays.asList(cityA, cityB)) {
            map2.computeIfAbsent(city, p -> new ArrayList<>()).add(person2);
        }


        map2.forEach((city, person) -> {
            map.merge(city, person, (personMap1, personMap2) -> {
                personMap1.addAll(personMap2);
                return personMap1;
            });
        });


        map.forEach((city, person) -> {
            System.out.println(city + ":" + person);
        });



/*        Map<String, Map<String, Person>> cMap = new HashMap<>();

        cMap.computeIfAbsent("one", key -> new HashMap<>())
           .put("two", person);*/

//        System.out.println(cMap);
    }
}
