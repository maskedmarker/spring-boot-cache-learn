package org.example.learn.spring.boot.cache.hello;

import org.example.learn.spring.boot.cache.hello.model.User;
import org.example.learn.spring.boot.cache.hello.service.UserService;
import org.example.learn.spring.boot.cache.hello.util.JsonUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test0() {
        List<User> allUsers = userService.findAllUsers();
        String toJsonStr = JsonUtils.toJsonStr(allUsers);
        System.out.println("toJsonStr = " + toJsonStr);
    }
}
