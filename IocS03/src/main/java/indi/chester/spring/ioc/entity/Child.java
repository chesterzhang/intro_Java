package indi.chester.spring.ioc.entity;

public class Child {
    private String name;
    private Apple apple;

    public Child(String name, Apple apple) {
        this.name = name;
        this.apple = apple;
    }

    public Child() {
        System.out.println("使用无参构造方法创建对象 : " + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        System.out.println("正在注入Apple 对象 : " + apple);
        this.apple = apple;
    }

    public void eat(){
        System.out.println(this.getName()+" 吃 " + this.getApple().getTitle());
    }

}
