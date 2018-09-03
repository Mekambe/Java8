package Cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Andrzej", "Kowalski", 42);
        Person person2 = new Person("Annia", "Kowalska", 40);
        Person person3 = new Person("Agelika", "Kowalska", 18);
        Person person4 = new Person("Antoni", "Kowalski", 26);
        Person person5 = new Person("Andri", "Kowalski", 21);
        Person person6 = new Person("Alla", "Kowalska", 18);

        List<Person> people = Arrays.asList(person1,person2,person3,person4, person5, person6);

        //Consumer cons = person -> System.out.println(person);
        consumeList(people, (person -> System.out.println(person)));
consumeList(people,);
    }

    static <T> void consumeList (List<T> list, Consumer<T> consumer){
        for (T t: list) {
            consumer.accept(t);

        }

    }
}
