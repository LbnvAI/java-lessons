package org.anton.lists;

import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

@Getter
public final class User {

    private final String name;
    private final List<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public String toString() {
        return name;
    }
}
