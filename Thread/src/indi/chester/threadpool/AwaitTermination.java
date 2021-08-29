package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTermination {

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            threadPool.execute(new SimpleTask3());
        }

        threadPool.shutdown();
        try {
            //两种情况返回 bool 值 1.到达等待时间, 2.所有任务执行完毕
            //awaitTermination(parm1, parm2) 方法, 到达parm1(parm2時間單位)后, 线程池内的线程是否已经全部执行完毕
            System.out.println(threadPool.awaitTermination(5, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
