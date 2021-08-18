package indi.chester.thread;

public class Priority implements  Runnable{

    //线程的启动需要重写 run 方法
    @Override
    public void run(){

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"线程正在执行"+"第"+i+"次for循环");
        }
    }
}
