package org.anton.collections.functions;

import lombok.Getter;

@Getter
public final class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " - " + author;
    }
}