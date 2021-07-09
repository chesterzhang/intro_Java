package indi.chester.thread;

//演示Sleep()方法,将线程切换到 阻塞状态
public class SleepThread implements  Runnable {

    @Override
    public void run() {
        //为了证明多线程的运行不是按照固定顺序的,而是由操作系统决定
        for (int i=0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+"第"+i+"次for循环.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
