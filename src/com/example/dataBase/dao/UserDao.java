package com.example.dataBase.dao;

import com.example.dataBase.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int addUser(@Param("user") User user);
    List<User> getUserList(@Param("start") Integer start, @Param("count") Integer count);
    User getUserByName(String name);
    void delele(String name);
}
