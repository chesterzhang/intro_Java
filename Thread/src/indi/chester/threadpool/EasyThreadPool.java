package indi.chester.threadpool;

import java.util.concurrent.LinkedBlockingQueue;

public class EasyThreadPool {

    private final int nThreads; // 线程池线程的固定个数
    private final PoolWorker[] threads;//线程池里面的线程,PoolWorker是自定义线程类, 继承了Thread类
    private final LinkedBlockingQueue<Runnable> queue;//无界队列,里面存放需要被执行的任务,也就是实现Runnable接口的类

    public EasyThreadPool(int nThreads) {
        this.nThreads = nThreads;
        queue = new LinkedBlockingQueue();
        threads = new PoolWorker[nThreads];


        for (int i = 0; i < nThreads; i++) {

            threads[i] = new PoolWorker("PoolWoker"+String.valueOf(i));
            threads[i].start();
        }
    }
 
    public void execute(Runnable task) {
        synchronized (queue) {
            queue.add(task); // 向队列中添加任务
            queue.notify();  // 一旦有新任务,就尝试去唤醒一个线程
        }
    }

    //PoolWorker是自定义线程类, 继承了Thread类,其作用是不断地从任务队列里面取出任务, 若队列为空, 则调用 wait 方法等待
    private class PoolWorker extends Thread {

        public PoolWorker(String name) {
            super(name);
        }

        @Override
        public void run() {
            Runnable task;

            while (true) {
                synchronized (queue) {//对 queue 上锁
                    while (queue.isEmpty()) {
                        try {
                            queue.wait(); // 任务队列里面没有任务,先释放锁, 再进入睡眠,等待被唤醒
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }
                    // 线程被唤醒之后 又会给queue 上锁
                    task = queue.poll(); // 获取任务
                }

                // If we don't catch RuntimeException,
                // the pool could leak threads
                try {
                    task.run(); // 执行任务
                } catch (RuntimeException e) {
                    System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                }
            }
        }
    }


    public static void main(String[] args) {
        EasyThreadPool pool = new EasyThreadPool (3);

        for (int i = 0; i < 10; i++) {
            Task task = new Task(i);
            pool.execute(task);

        }
    }
}

class Task implements Runnable {

    private int num;

    public Task(int n) {
        num = n;
    }

    @Override
    public void run() {
        System.out.println("Task " + num + " is running on "+ Thread.currentThread().getName()+".");
    }
}
