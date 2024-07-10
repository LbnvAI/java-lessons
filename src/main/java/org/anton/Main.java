package org.anton;

import org.anton.streams.Film;

import java.util.List;

import static org.anton.streams.App.getGenres;

public class Main {
    public static void main(String[] args) {
        var films = List.of(
                new Film("Liquid Sky", List.of("thriller", "Action")),
                new Film("Superman", List.of("Action", "fantasy", "thriller")),
                new Film("Norwegian Ninja", List.of("THRILLER"))
        );
        getGenres(films);
    }
}