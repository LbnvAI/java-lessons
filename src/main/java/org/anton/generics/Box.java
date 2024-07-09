package org.anton.generics;

// Class for storing a value of any type
public class Box {
    Object value;

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
}
