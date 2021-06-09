package com.makschornyi.rebasetrainingproj.model.user;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
}
