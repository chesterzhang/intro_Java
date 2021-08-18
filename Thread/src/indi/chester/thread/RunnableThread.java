package indi.chester.thread;

//线程的创建有两种
//1. 继承Thread 类
//2. 实现Runnable接口,重写run()方法
//实际应用中 第二种方法更常见,因为Java不支持多继承

public class RunnableThread implements  Runnable{

    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+"第"+i+"次for循环.");
        }

    }
}
