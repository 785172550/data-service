package com.wh.dataservice.controller;

import com.wh.dataservice.dao.UserMapper;
import com.wh.dataservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/user")
@RestController()
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = {"", "/test"})
    public String testRequest(HttpServletRequest request) {
        return "UserController: your request is " + request.getRequestURL();
    }

    @RequestMapping("/user-info/")
    public User getUserByName(@RequestParam("name") String name) {
        return userMapper.getUserByName(name);
    }

    @GetMapping("/user-info/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userMapper.getOne(id);
    }

    @RequestMapping(value = "/user-info/", method = {RequestMethod.POST, RequestMethod.GET})
    public Integer inserUser(User user) {
        return userMapper.insert(user);
    }

    @RequestMapping(value = "/user-info/", method = {RequestMethod.PUT})
    public Integer updateUser(User user) {
        return userMapper.update(user);
    }

    @RequestMapping(value = "/user-info/{id}", method = {RequestMethod.DELETE})
    public Integer deleteUser(@PathVariable("id") Long id) {
        return userMapper.delete(id);
    }
}
