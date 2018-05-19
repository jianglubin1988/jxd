package com.jxd.service;

import com.jxd.entity.User;
import com.jxd.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public User findById(Integer id) {
        return mapper.findUserById(id);
    }

    @Override
    @Transactional
    public void insert(User user) {
        mapper.insert(user);
    }
}
