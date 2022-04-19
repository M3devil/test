package com.study.Spring5.factoryBean;

import com.study.Spring5.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBean implements FactoryBean<User>, BeanPostProcessor {
    //在初始化方法执行之后执行
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
//    }
//    //在初始化方法执行之前，调用set方法之后执行
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
//    }

    //由该方法决定该bean的返回类型
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("小天");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
