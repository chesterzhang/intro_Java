package indi.chester.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //私有化构造函数无法访问
        //Singleton1 one=new Singleton1();

        //只能通过共有的静态方法直接获取一个静态实例
        Singleton1 one=Singleton1.getInstance();
        Singleton1 two=Singleton1.getInstance();
        System.out.println(one);
        System.out.println(two);

        System.out.println("\n=============================================\n");

        Singleton2 one1=Singleton2.getInstance();
        Singleton2 two1=Singleton2.getInstance();
        System.out.println(one1);
        System.out.println(two1);

        
    }
}
