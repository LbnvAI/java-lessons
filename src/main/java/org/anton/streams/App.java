package org.anton.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

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

    // User collect and Collectors
    public static Map<String, Long> getFreeDomainsCount(List<String> emails) {
        return emails.stream()
                .filter(mail -> {
                    var domain = mail.split("@")[1];
                    return FREE_DOMAINS.contains(domain);
                })
                .collect(Collectors.groupingBy(mail -> {
                    return mail.split("@")[1];
                }, Collectors.counting()));
    }
}
