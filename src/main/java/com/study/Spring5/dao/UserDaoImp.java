package com.study.Spring5.dao;

import com.study.Spring5.bean.User;

public class UserDaoImp implements UserDao {

    @Override
    public void speak() {
        System.out.println("成功");
    }
}
