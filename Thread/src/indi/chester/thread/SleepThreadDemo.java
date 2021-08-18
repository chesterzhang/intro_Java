package indi.chester.thread;

public class SleepThreadDemo {
    public static void main(String[] args) {
        //创建 实现 Runnable 接口的对象
        Sleep  st= new Sleep ();

        //创建线程,传入实现Runnable接口的对象
        Thread t1=new Thread(st,"sleep thread 1");

        //启动线程
        t1.start();
    }
}
