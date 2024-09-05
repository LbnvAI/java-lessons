package org.anton.collections.generics;

public final class Woman implements Human {
    private final String name;
    public Woman(final String name) {
        this.name = name;
    }
    @Override
    public String getSex() {
        return "female";
    }
    @Override
    public String getName() {
        return name;
    }
}