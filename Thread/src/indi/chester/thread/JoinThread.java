package indi.chester.thread;

public class JoinThread implements  Runnable{
    @Override
    public void run() {
        for (int i=0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+"第"+i+"次for循环.");
        }

    }
}
