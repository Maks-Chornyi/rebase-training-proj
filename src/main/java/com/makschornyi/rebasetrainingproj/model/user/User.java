package com.makschornyi.rebasetrainingproj.model.user;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String name;
    private int age;
    private Status status;
    private LocalDateTime lastLogin;
}
