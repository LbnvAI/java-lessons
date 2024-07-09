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

    // Use reduce()
    public static Double getAverageAge(List<Person> persons) {
        Double averageAge = 0.0;
        if (persons.isEmpty()) return null;
        else averageAge = persons.stream().reduce(0.0, (acc, person) -> acc += person.getAge(), Double::sum);
        return averageAge / persons.size();
    }

    // Use filter and reduce
    public static int getTotalPrice(List<Product> goods) {
        return goods.stream()
                .filter((good) -> good.getCategory().equals("electronics"))
                .reduce(0, (acc, good) -> acc + good.getPrice(), Integer::sum);
    }
}
