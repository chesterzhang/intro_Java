package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTermination {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            threadPool.execute(new SimpleTask3());
        }


        try {
            //两种情况返回 bool 值 1.到达等待时间, 2.所有任务执行完毕
            System.out.println(threadPool.awaitTermination(10, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
