package com.citi.portfoliomanager.dao;

import com.citi.portfoliomanager.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by hkz on 2017/4/23.
 */
@Repository
public interface UserMapper {
    User get(String username);
}
