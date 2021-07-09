package indi.chester.thread;

//线程的创建有两种
//1. 继承Thread 类
//2. 实现Runnable接口,重写run()方法
//实际应用中 第二种方法更常见,因为Java不支持多继承

public class RunnableThread implements  Runnable{
    int i=0;
    @Override
    public void run() {
        //为了证明多线程的运行不是按照固定顺序的,而是由操作系统决定
        for (; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+"第"+i+"次for循环.");
        }

    }
}
