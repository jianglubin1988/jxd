package com.jxd.service;

import com.jxd.entity.User;

public interface UserService {

    public User findById(Integer id);

    public void insert(User user);

}
