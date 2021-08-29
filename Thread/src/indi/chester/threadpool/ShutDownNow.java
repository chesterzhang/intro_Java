package indi.chester.threadpool;

// shutDownNow() 方法
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownNow {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            threadPool.execute(new SimpleTask4());
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Runnable> threadList= threadPool.shutdownNow();

        System.out.println("isShutDown ? "+threadPool.isShutdown());
        System.out.println("isTerminated ? "+threadPool.isTerminated());

        for (Runnable t: threadList) {
            System.out.println(t.toString());
        }

    }
}
