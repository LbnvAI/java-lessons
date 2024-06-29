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
        List<Integer> noNegativenumbersList = new ArrayList<Integer>();
        for (Integer num : numbers) {
            if (num < 0) noNegativenumbersList.add(0);
            else noNegativenumbersList.add(num);
        }
        return noNegativenumbersList;
    }
}
