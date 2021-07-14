package indi.chester.singleton;

//懒汉式: 创建类的时候实例化一个null对象。
//每一次尝试实例化的时候查询一下实例化是否为null, 若不为null, 创建一个静态对象, 反之返回静态对象。
public class Singleton2 {
    //1.创建私有构造
    private Singleton2() { }

    //2.创建类的时候实例化一个null
    private static Singleton2 instance=null;

    //3.设置一个获取实例化的函数
    public static Singleton2  getInstance() {
        if(instance==null) {
            instance= new Singleton2();
        }
        return instance;
    }
}
