package com.jxd.web;

import com.jxd.entity.User;
import com.jxd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/user")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {

        return null;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute User user) {
        service.insert(user);
        return "success";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public String getUser(@RequestParam Integer id) {
        return service.findById(id).toString();
    }


}