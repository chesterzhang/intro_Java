package indi.chester.threadpool;

public class SimpleTask2 implements  Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
