package org.anton.maps;

import java.util.Map;

public class App {
    private static final Map<String, Double> products = Data.getProducts();

    // Find discount in catalog and return new price
    public static Double getPriceWithDiscount(Map<String, Double> discountCart, String productName) {
        if (products.containsKey(productName)) {
            if (!discountCart.containsKey(productName)) return products.get(productName);
            else return products.get(productName) * discountCart.get(productName) / 100;
        } else return null;
    }
}
