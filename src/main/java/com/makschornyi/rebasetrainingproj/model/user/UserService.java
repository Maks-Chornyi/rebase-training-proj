package com.makschornyi.rebasetrainingproj.model.user;

import com.makschornyi.rebasetrainingproj.model.user.exception.UserAlreadyExistException;
import com.makschornyi.rebasetrainingproj.model.user.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private static final Map<UUID, User> users = new HashMap<>();

    public User createUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new UserAlreadyExistException("User already exist");
        }
        users.put(user.getId(), user);

        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public User findById(String id) {
        if (!users.containsKey(UUID.fromString(id))) {
            throw new UserNotFoundException("User with id: " + id + " not found.");
        }
        return users.get(UUID.fromString(id));
    }
}
