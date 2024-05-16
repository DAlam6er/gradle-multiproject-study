package com.dmdev.service;

import com.dmdev.dao.UserDao;
import com.dmdev.dto.UserDto;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class UserService {
    private static final UserService INSTANCE = new UserService();

    private final UserDao userDao = UserDao.getInstance();

    private UserService() {
    }

    public static UserService getInstance() {
        return INSTANCE;
    }

    public List<UserDto> getAll() {
        return userDao.findAll().stream()
                .map(user -> UserDto.builder()
                        .id(user.id())
                        .name(user.name())
                        .build())
                .collect(toList());
    }
}
