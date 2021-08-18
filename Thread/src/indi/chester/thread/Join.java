package indi.chester.thread;

public class Join implements  Runnable{
    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+"第"+i+"次for循环.");
        }
    }
}
