package com.dmdev.dao;

import com.dmdev.model.User;

import java.util.List;

public class UserDao
{
    private static final UserDao INSTANCE = new UserDao();

    private UserDao() {}

    public static UserDao getInstance()
    {
        return INSTANCE;
    }

    public List<User> findAll()
    {
        return List.of(
            new User(13, "Ivan"),
            new User(23, "Petr"),
            new User(33, "Sveta")
        );
    }
}
