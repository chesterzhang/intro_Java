package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService  threadPool= Executors.newScheduledThreadPool(10);

        threadPool.schedule(new SimpleTask2(),5, TimeUnit.SECONDS);

        threadPool.scheduleAtFixedRate(new SimpleTask2(),1,3,TimeUnit.SECONDS);

    }

}
