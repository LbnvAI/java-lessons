package org.anton;

import org.anton.functions.App;
import org.anton.functions.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var users = new ArrayList<>(List.of(
                new User("Salli", LocalDate.of(1990, 12, 15)),
                new User("Gawen", LocalDate.of(2002, 10, 23)),
                new User("Emmalee", LocalDate.of(1992, 9, 16))
        ));

        var oldestUsers1 = App.getOldest(users);
        System.out.println(oldestUsers1); // => [Salli 1990-12-15]

        var oldestUsers2 = App.getOldest(users, 2);
        System.out.println(oldestUsers2); // => [Salli 1990-12-15, Emmalee 1992-9-16]
    }
}