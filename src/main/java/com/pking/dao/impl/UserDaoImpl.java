package com.pking.dao.impl;

import com.pking.dao.UserDao;
import com.pking.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Properties;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private List<String> list;
    private Map<String, User> map;
    private Properties props;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public void save() {
        System.out.println(list);
        System.out.println(map);
        System.out.println(props);
    }
}
