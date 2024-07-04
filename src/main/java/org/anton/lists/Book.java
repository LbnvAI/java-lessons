package org.anton.lists;

import lombok.Getter;

@Getter
public final class Book {

    private final String title;
    private final String authorName;
    private final String genre;

    public Book(String title, String authorName, String genre) {
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
    }
}
