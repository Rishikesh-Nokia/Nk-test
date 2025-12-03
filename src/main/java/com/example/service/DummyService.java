package com.example.service;

import com.example.model.User;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DummyService {
    private List<User> users = Arrays.asList(
        new User("Alice", "alice@example.com"),
        new User("Bob", "bob@example.com"),
        User("Charlie", "charlie@example.com")
    );

    public User getRandomUser() {
        return users.get(new Random().nextInt(users.size()));
    }
}
