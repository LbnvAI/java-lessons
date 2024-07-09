package org.anton.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class App {
    public static List<Integer> duplicate(List<Integer> numbers) {
        List<Integer> duplicate = new ArrayList<Integer>(numbers);
        UnaryOperator<Integer> dp = value -> value * 2;
        duplicate.replaceAll(dp);
        return duplicate;
    }
}
