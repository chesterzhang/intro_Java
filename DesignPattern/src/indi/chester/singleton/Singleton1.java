package indi.chester.singleton;

//饿汉式: 创建类的时候直接实例化
public class Singleton1 {
    //1.创建私有构造
    private Singleton1() {

    }
    //2.创建该类型的私有静态实例
    private static Singleton1 instance=new Singleton1();

    //3.创建静态方法返回静态实例对象
    public static Singleton1 getInstance() {
        return instance;
    }

}
