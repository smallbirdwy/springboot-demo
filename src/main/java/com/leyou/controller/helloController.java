package com.leyou.controller;

import com.leyou.pojo.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class helloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public User hello() {
        User user = this.userService.queryById(2L);
        return user;
    }
}
