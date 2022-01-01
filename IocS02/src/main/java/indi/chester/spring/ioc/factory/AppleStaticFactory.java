package indi.chester.spring.ioc.factory;

import indi.chester.spring.ioc.entity.Apple;

//静态工厂通过静态方法创建对象, 隐藏创建对象的细节
public class AppleStaticFactory {
    public static Apple createSweetApple(){
        Apple apple =new Apple();
        apple.setTitle("红富士");
        apple.setOrigin("欧洲");
        apple.setColor("红色");
        System.out.println("通过静态方法创建对象 : "+apple);
        return apple;
    }
}
