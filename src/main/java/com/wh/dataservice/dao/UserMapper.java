package com.wh.dataservice.dao;

import com.wh.dataservice.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    User getUserByName(String name);

    int insert(User user);

    int update(User user);

    int delete(Long id);
}
