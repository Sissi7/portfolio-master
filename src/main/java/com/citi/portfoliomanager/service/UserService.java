package com.citi.portfoliomanager.service;

import com.citi.portfoliomanager.dao.UserMapper;
import com.citi.portfoliomanager.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hkz on 2017/4/23.
 */
@Service
public class UserService{
    protected static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    public User getUser(String username) {
        return userMapper.get(username);
    }
}
