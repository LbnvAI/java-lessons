package org.anton.Lists;

import java.util.List;

public class App {
    public static String getOrDefault(List<String> collection, int index, String defaultValue) {
        if (index >= collection.size() || index < 0) return defaultValue;
        else return collection.get(index);
    }
}
