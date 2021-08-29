package indi.chester.threadpool;

public class SimpleTask4 implements  Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断!");
        }

    }
}
