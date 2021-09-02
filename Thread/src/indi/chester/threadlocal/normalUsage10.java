package indi.chester.threadlocal;



//ThreadLocal 第二个 用法, 在每个线程内都需要保存的 全局变量， 可以用 ThreadLocal, 避免传递参数
public class normalUsage10 {

    public static void main(String[] args) {
        new Service1().process("");
    }

}

class Service1 {

    public void process(String name) {

        User user = new User("张三");
        //使用set() 方法而不是 intialValue() 方法是因为我们并不知道 ThreadLocal 里面的对象
        //我们需要等待其他的类告诉他应该怎样被初始化
        UserContextHolder.holder.set(user);// 将 user 对象装进 ThreadLocal 中
        new Service2().process();
    }
}

class Service2 {

    public void process() {
        User user = UserContextHolder.holder.get();
        System.out.println("Service2拿到用户名：" + user.userName);
        new Service3().process();
    }
}

class Service3 {

    public void process() {
        User user = UserContextHolder.holder.get();
        System.out.println("Service3拿到用户名：" + user.userName);
        UserContextHolder.holder.remove();//将ThreadLocal的值清除, 需要再次调用 get() 方法才能调用 set 方法
    }
}

class UserContextHolder {

    public static ThreadLocal<User> holder = new ThreadLocal<>();


}

//需要在不同类中传递的 类
class User {

    String userName;

    public User(String userName) {
        this.userName = userName;
    }
}

