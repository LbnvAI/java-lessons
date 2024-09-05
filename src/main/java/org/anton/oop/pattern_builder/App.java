package org.anton.oop.pattern_builder;

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
