package com.suntech.project.service;

import com.suntech.project.mapper.UserMapper;
import com.suntech.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUsers() {
        return this.userMapper.findAll();
    }

    public List<User> findAllUsersBy(User user) {
        return this.userMapper.findAllBy(user);
    }

}
