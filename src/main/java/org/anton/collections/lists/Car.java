package org.anton.collections.lists;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public final class Car {

    private final String made;
    private final String model;
    private final LocalDate manufacturedAt;

    public Car(String made, String model, LocalDate manufacturedAt) {
        this.made = made;
        this.model = model;
        this.manufacturedAt = manufacturedAt;
    }

    @Override
    public String toString() {
        return made + " " + model;
    }
}
