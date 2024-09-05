package org.anton.collections.functions;

import java.util.*;
import java.util.function.Function;

public class App {

    // Try to using lambdas
    public static void printBalance(Map<String, Integer> storage, int balance) {
        storage.forEach((k, v) -> {
            if (v < balance) System.out.println(k);
        });
    }

    // Using lambdas to sort lists
    public static List<User> getOldest(List<User> users) {
        List<User> oldest = new ArrayList<>();
        if (users.isEmpty()) return oldest;
        else {
            List<User> sortedUsers = new ArrayList<>(users);
            sortedUsers.sort((u1, u2) -> {
                if (u1.getBirthday().isEqual(u2.getBirthday())) return 0;
                else if (u1.getBirthday().isBefore(u2.getBirthday())) return -1;
                else return 1;
            });
            oldest.add(sortedUsers.getFirst());
            return oldest;
        }
    }

    public static List<User> getOldest(List<User> users, int count) {
        List<User> oldest = new ArrayList<>();
        if (users.isEmpty()) return oldest;
        else {
            List<User> sortedUsers = new ArrayList<>(users);
            sortedUsers.sort((u1, u2) -> {
                if (u1.getBirthday().isEqual(u2.getBirthday())) return 0;
                else if (u1.getBirthday().isBefore(u2.getBirthday())) return -1;
                else return 1;
            });
            for (int i = 0; i < count; i++) {
                oldest.add(sortedUsers.get(i));
            }
            return oldest;
        }
    }

    // Count numbers by sign
    public static Map<String, Integer> countNumbers(List<Integer> numbers) {
        Map<String, Integer> map = new HashMap<>();
        map.put("positive", 0);
        map.put("negative", 0);
        map.put("zero", 0);
        numbers.forEach(n -> {
            if (n == 0) map.put("zero", map.get("zero") + 1);
            if (n > 0) map.put("positive", map.get("positive") + 1);
            if (n < 0) map.put("negative", map.get("negative") + 1);
        });
        return map;
    }

    // Create method, using lambda as a parameter
    BinaryOperation add = (a, b) -> a + b;
    BinaryOperation sub = (a, b) -> a - b;

    public static int calculate(int a, int b, BinaryOperation operation) {
        return operation.operation(a, b);
    }

    // Use method references to sort List
    public static List<Book> sortBooks(List<Book> books) {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparing(Book::getTitle).reversed());
        return sortedBooks;
    }

    // Apply lambda to all elements in list
    public static List<String> map(List<String> strings, Function<String, String> fn) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(fn.apply(str));
        }
        return result;
    }
}
