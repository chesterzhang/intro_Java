package indi.chester.spring.ioc.factory;

import indi.chester.spring.ioc.entity.Apple;

//工厂实例方法是指 IoC容器对工厂进行实例化并调用 对应的实例方法创建 对象
public class AppleFactoryInstance {
    public Apple createSweetApple(){
        Apple apple =new Apple();
        apple.setTitle("红富士");
        apple.setOrigin("欧洲");
        apple.setColor("红色");
        System.out.println("通过工厂实例方法创建对象 : " + apple);
        return apple;
    }
}
