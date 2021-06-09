package com.makschornyi.rebasetrainingproj.model.user;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
