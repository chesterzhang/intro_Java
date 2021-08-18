package indi.chester.thread;

public class RunnableThreadDemo {
    public static void main(String[] args) {
        //创建 实现 Runnable 接口的对象
        RunnableThread rt= new RunnableThread();

        //创建线程,传入实现Runnable接口的对象
        Thread t1=new Thread(rt,"runnable thread 1");

        //启动线程
        t1.start();

        //将同一个 实现 Runnable 接口的对象 传给多个线程
        //相当于多线程共同处理 实现 Runnable 接口的对象 内的数据
        Thread t2=new Thread(rt,"runnable thread 2");
        t2.start();

    }

}

