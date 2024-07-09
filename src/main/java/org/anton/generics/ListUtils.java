package org.anton.generics;

import java.util.ArrayList;
import java.util.List;

public class ListUtils<T> {

    public List<T> merge(List<T> l1, List<T> l2) {
        List<T> result = new ArrayList<T>();
        result.addAll(l1);
        result.addAll(l2);
        return result;
    }
}
