package com.suntech.project.mapper;

import com.suntech.project.model.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();
    List<User> findAllBy(User user);
}
