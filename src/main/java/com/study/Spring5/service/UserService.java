package com.study.Spring5.service;

import com.study.Spring5.dao.UserDao;

public class UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void get(){
        userDao.speak();
    }
}
