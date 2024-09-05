package org.anton.oop.builder_pattern;

public class App {
    public static Pizza getPizza(){
        return Pizza.builder()
                .size("big")
                .dough("thin")
                .sauce("tomato")
                .vegetableTopping("basil")
                .cheeseTopping("mozzarella")
                .build();
    }
}
