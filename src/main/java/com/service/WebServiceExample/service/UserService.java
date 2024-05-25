package com.service.WebServiceExample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.service.WebServiceExample.api.model.User;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ida", 22, "teste@teste.com");
        User user2 = new User(2, "Hans", 32, "teste@teste.com");
        User user3 = new User(3, "Jhon", 28, "teste@teste.com");
        User user4 = new User(4, "Myke", 45, "teste@teste.com");
        User user5 = new User(5, "Andy", 53, "teste@teste.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
