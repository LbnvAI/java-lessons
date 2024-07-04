package org.anton.maps;

import java.util.Map;
import java.util.Set;

public class App {
    private static final Map<String, Double> products = Data.getProducts();

    // Find discount in catalog and return new price
    public static Double getPriceWithDiscount(Map<String, Double> discountCart, String productName) {
        if (products.containsKey(productName)) {
            if (!discountCart.containsKey(productName)) return products.get(productName);
            else return products.get(productName) * discountCart.get(productName) / 100;
        } else return null;
    }

    // Find the most populated city
    public static String getMostPopulatedCity(Map<String, Integer> cities) {
        Set<String> cityNames = cities.keySet();
        String mostPopulatedCity = null;
        int maxValue = 0;
        for (String cityName : cityNames) {
            if (cities.get(cityName) > maxValue) {
                maxValue = cities.get(cityName);
                mostPopulatedCity = cityName;
            }
        }
        return mostPopulatedCity;
    }
}
