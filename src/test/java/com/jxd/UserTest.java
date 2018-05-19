package com.jxd;

import com.jxd.entity.User;
import com.jxd.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Resource
    private UserMapper userMapper;

    @Test
    @Transactional
    public void test() {
//        userMapper.insert("张三", "123456", "18600000000");
//        userMapper.insert("李四", "123456", "13500000000");
//        User u = userMapper.findUserById(1);
//        System.out.println("finish");
    }
}
