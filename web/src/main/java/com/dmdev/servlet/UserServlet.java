package com.dmdev.servlet;

import com.dmdev.service.UserService;
import com.dmdev.util.StringUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/users")
public class UserServlet extends HttpServlet
{
    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
        userService.getAll().forEach(userDto -> writer.write("""
            <h1>%d: %s</h1>
            """.formatted(userDto.getId(), StringUtils.trim(userDto.getName()))));

    }
}
