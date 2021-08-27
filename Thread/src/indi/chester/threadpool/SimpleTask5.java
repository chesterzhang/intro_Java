package indi.chester.threadpool;

public class SimpleTask5 implements Runnable{
    @Override
    public void run() {
        System.out.println("我被执行");
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
