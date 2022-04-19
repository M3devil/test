package com.pking.service.impl;

import com.mysql.jdbc.Driver;
import com.pking.dao.UserDao;
import com.pking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("userService")
@Scope("singleton")
public class UserDaoImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;
//    @Autowired  //按照数据类型在Spring容器中匹配
//    @Qualifier("userDao")  //按照id值从容器中进行匹配，主要还是Autowired+Qualifier结合使用
    @Resource(name = "userDao") //按照名字匹配
    private UserDao userDao;




    public UserDaoImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDaoImpl() {
    }

    @Override
    public void save() {
        System.out.println(driver);
        System.out.println("setIn生效");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化。。");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁了。。");
    }
}
