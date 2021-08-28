package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService threadPool= Executors.newFixedThreadPool(4);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            threadPool.execute(new SimpleTask1());
        }
    }

}


