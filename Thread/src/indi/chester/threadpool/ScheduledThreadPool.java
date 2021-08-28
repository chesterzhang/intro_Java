package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService  threadPool= Executors.newScheduledThreadPool(10);

        //用法1, 延迟5秒运行线程池
        threadPool.schedule(new SimpleTask2(),5, TimeUnit.SECONDS);

        //用法2, 延迟1秒运行线程池, 以后每隔三秒处理一个任务
        threadPool.scheduleAtFixedRate(new SimpleTask2(),1,3,TimeUnit.SECONDS);

    }

}
