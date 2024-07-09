package org.anton;

import org.anton.streams.App;
import org.anton.streams.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var products = List.of(
                new Product("bread", "grocery", 10),
                new Product("milk", "grocery", 15),
                new Product("harry potter", "books", 500),
                new Product("mobile phone", "electronics", 10000),
                new Product("bmw", "transport", 2000000),
                new Product("computer", "electronics", 20000),
                new Product("cheese", "grocery", 200),
                new Product("notebook", "electronics", 25000)
        );
        System.out.println(App.getTotalPrice(products));
    }
}