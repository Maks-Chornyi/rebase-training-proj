package com.makschornyi.rebasetrainingproj.model.user.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String msg) {
        super(msg);
    }
}
