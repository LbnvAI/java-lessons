package org.anton.Lists;

import lombok.Getter;

@Getter
public final class Product {

    private final String title;
    private final int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
