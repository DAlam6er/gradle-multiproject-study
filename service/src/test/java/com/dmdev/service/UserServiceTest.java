package com.dmdev.service;

import com.dmdev.dto.UserDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest
{
    private final UserService userService = UserService.getInstance();

    @Test
    void getAll()
    {
        List<UserDto> actual = userService.getAll();
        assertEquals(3, actual.size());
    }
}
