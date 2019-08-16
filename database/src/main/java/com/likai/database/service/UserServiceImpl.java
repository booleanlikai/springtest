package com.likai.database.service;

import com.likai.database.dao.UserMapper;
import com.likai.database.model.User;
import com.likai.database.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> query_all() {
        return userMapper.selectAll();
    }

    public List<User> query_all_ss() {
        return userMapper.selectAll_s();
    }
}
