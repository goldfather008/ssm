package com.huyonghua.dao;

import com.huyonghua.domain.User;

public interface UserDao {
    public User findByUsername(String username);
}
