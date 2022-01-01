package indi.chester.spring.ioc;

import indi.chester.spring.ioc.entity.Apple;
import indi.chester.spring.ioc.entity.Child;

public class Application {
    public static void main(String[] args) {
        Apple apple1= new Apple("红富士","红色", "欧洲");
        Apple apple2= new Apple("青苹果","绿色", "中亚");

        Child lily=new Child("Lily", apple1 );
        Child tom=new Child("Tom", apple2 );

        lily.eat();
        tom.eat();

    }
}
