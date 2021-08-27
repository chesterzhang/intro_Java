package indi.chester.threadpool;

// shutDownNow() 方法
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownNow {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 30; i++) {
            threadPool.execute(new SimpleTask4());
        }



        List<Runnable> threadList= threadPool.shutdownNow();
        for (Runnable t: threadList) {
            System.out.println(t.toString());
        }

    }
}
