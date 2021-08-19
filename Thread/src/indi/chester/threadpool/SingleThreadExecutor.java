package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            threadPool.execute(new SimpleTask2());
        }

    }


}



