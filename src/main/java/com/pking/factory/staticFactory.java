package com.pking.factory;

import com.pking.dao.UserDao;
import com.pking.dao.impl.UserDaoImpl;

public class staticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
