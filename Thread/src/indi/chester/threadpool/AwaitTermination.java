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
            //awaitTermination(parm1, parm2) 方法, 到達parm1(parm2時間單位)后， 綫程池内的綫程是否已經全部執行完畢
            System.out.println(threadPool.awaitTermination(10, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
