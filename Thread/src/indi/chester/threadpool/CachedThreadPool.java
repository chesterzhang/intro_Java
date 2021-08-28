package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool  {

    public static void main(String[] args) {
        ExecutorService threadPool= Executors.newCachedThreadPool();
        for (int i = 0; i < 500; i++) {
            threadPool.execute(new SimpleTask2());
        }
    }
}
