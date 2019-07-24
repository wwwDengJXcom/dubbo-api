package com.czh.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.czh.dubbo.common.entity.User;
import com.czh.dubbo.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/user")
    public User getPeople(User user) {

        return userService.getUser(user);
    }
}
