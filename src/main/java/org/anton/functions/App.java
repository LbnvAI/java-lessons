package org.anton.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
}
