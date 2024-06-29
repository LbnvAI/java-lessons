package org.anton.Lists;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static String getOrDefault(List<String> collection, int index, String defaultValue) {
        if (index >= collection.size() || index < 0) return defaultValue;
        else return collection.get(index);
    }

    // Seek items by for-each
    public static List<Integer> replaceByZero(List<Integer> numbers) {
        List<Integer> noNegativeNumbersList = new ArrayList<Integer>();
        for (Integer num : numbers) {
            if (num < 0) noNegativeNumbersList.add(0);
            else noNegativeNumbersList.add(num);
        }
        return noNegativeNumbersList;
    }

    // Find product title where price in range minPace - maxPrice
    public static List<String> getProductsByPrice(List<Product> products, int minPrice, int maxPrice) {
        List<String> result = new ArrayList<String>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                result.add(product.getTitle());
            }
        }
        return result;
    }
}
