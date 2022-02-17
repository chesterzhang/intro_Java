package indi.chester.spring.ioc.service;

import indi.chester.spring.ioc.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public UserService() {
        System.out.println("UserService 已创建 : "+ this);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("调用 setUerDao : "+ userDao);
        this.userDao = userDao;
    }
}
