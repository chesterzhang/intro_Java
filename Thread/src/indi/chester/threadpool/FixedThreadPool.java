package indi.chester.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(4);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            es.execute(new SimpleTask());
        }
        
    }


}

class SimpleTask implements  Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
