package indi.chester.thread;

public class PriorityThread implements  Runnable{

    //线程的启动需要重写 run 方法
    @Override
    public void run(){
        //为了证明多线程的运行不是按照固定顺序的,而是由操作系统决定
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"线程正在执行"+"第"+i+"次for循环");
        }
    }
}
