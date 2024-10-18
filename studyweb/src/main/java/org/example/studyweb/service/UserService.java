package org.example.studyweb.service;

import org.example.studyweb.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void save(User user);

    Boolean register(User user);

    Boolean login(User user);

    void update(User user);

}
