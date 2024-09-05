package org.anton.collections.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListUtils<T> {

    public List<T> merge(List<T> l1, List<T> l2) {
        List<T> result = new ArrayList<T>();
        result.addAll(l1);
        result.addAll(l2);
        return result;
    }

    // Create static generic method
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> filtredList = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                filtredList.add(t);
            }
        }
        return filtredList;
    }

    // Work with WildCards
    public static int findFirstIndex(List<? extends Human> list, String namePrefix) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().startsWith(namePrefix)) return i;
        }
        return -1;
    }
}
