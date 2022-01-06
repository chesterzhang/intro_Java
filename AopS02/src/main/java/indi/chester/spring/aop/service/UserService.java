package indi.chester.spring.aop.service;

import indi.chester.spring.aop.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void createUser(){
        try {
            Thread.sleep(2000);//为了演示环绕通知
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行创建用户业务逻辑");
        userDao.insert();
    }

    public String generateRandomPassword(String type , Integer length){
        System.out.println("按" + type + "方式生成"+ length  + "位随机密码");
        return "Zxcquei1";
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
