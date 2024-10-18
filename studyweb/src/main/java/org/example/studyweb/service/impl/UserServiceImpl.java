package org.example.studyweb.service.impl;

import org.example.studyweb.mapper.UserMapper;
import org.example.studyweb.pojo.User;
import org.example.studyweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {return userMapper.findAll();}

    @Override
    public Boolean register(User user) {

        if(userMapper.findByUsername(user)!=null)
            return false;
        else return true;

    }

    @Override
    public void save(User user) {
        userMapper.insertUser(user);
    };

    @Override
    public Boolean login(User user) {

        if(userMapper.findByUsernameAndPassword(user)!=null)
            return true;
        else return false;
    }

    @Override
    public void update(User user) {
        userMapper.updateUser(user);
    }
}
