package com.makschornyi.rebasetrainingproj.model.user;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private static final Map<UUID, User> users = new HashMap<>();

    public User createUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new RuntimeException("User already exist");
        } else {
            users.put(user.getId(), user);
        }
        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public User findById(String id) {
        if (!users.containsKey(UUID.fromString(id))) {
            throw new RuntimeException("No user with such id");
        }
        return users.get(UUID.fromString(id));
    }
}
