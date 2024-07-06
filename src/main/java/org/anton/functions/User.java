package org.anton.functions;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public final class User {

    private final String name;
    private final LocalDate birthday;

    public User(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + " " + birthday.toString();
    }
}
