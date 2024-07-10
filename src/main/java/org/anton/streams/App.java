package org.anton.streams;

import java.util.*;
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

//    public static Map<String, Long> getGenres(List<Film> films){
//        // Создаем стрим
//        return films.stream()
//                // Делаем отображение, где все элементы внутри списка жанров в нижнем регистре
//                .map(film -> film.getGenres().stream().map(String::toLowerCase))
//                // Создание Map....               Подсчет элементов
//                .collect(Collectors.groupingBy(),Collectors.counting());
//    }

    // Use Optional type
    public static User findUserById(List<User> users, long id) {
        var result = users.stream().filter(user -> user.getId() == id).findFirst();
        if (result.isPresent()) return result.get();
        else throw new RuntimeException("User not found");
    }

    // Find second biggest
    public static Number getSecondBiggest(List<Integer> numbers) {
        if (numbers.size() <= 1) return null;
        else return numbers.stream().sorted(Comparator.reverseOrder()).toList().get(1);
    }
}
