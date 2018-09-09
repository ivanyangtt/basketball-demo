package org.so.demo.sodemo.service.Impl;

import org.so.demo.sodemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl {
    @Autowired
    public UserDao userDao;
}
