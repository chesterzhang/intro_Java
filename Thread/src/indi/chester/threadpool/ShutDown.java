package indi.chester.threadpool;

//介紹shutDown(), isShutDown(), isTerminated() 方法
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ShutDown {

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            threadPool.execute(new SimpleTask3());
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("isShutDown ? "+threadPool.isShutdown());
        threadPool.shutdown();
        System.out.println("isShutDown ? "+threadPool.isShutdown());
        System.out.println("isTerminated ? "+threadPool.isTerminated());

        //shutDown以后提交新任务， 直接报错
        threadPool.execute(new SimpleTask3());


    }

}
