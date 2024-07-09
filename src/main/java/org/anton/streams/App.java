package org.anton.streams;

import java.util.ArrayList;
import java.util.List;

public class App {
    // Try to use streams
    public static List<String> sortWords(List<String> words) {
        return words.stream().sorted().toList();
    }

    // Use map()
    public static List<String> normalize(List<String> emails) {
        return emails.stream().map(String::trim).map(String::toLowerCase).toList();
    }

    // Use filter() and map()
    public static List<String> getAdultUserNames(List<Person> humans) {
        return humans.stream().filter(human -> human.getAge() >= 18).map(Person::getName).toList();
    }


}
