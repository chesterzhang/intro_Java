package indi.chester.threadpool;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//可暂停的线程池, 继承普通的线程池, 演示每个任务执行前后放钩子函数

public class PauseableThreadPool extends ThreadPoolExecutor {

    private boolean isPaused;//线程池是否暂停标记位

    //为了并发地访问和修改isPaused, 用一把锁
    private final ReentrantLock lock = new ReentrantLock();

    //Condition 主要有两个方法 await() 和 signalAll()
    //Conditon中的 await() 对应 Object 的 wait()；
    //Condition中的 signalAll() 对应 Object的notifyAll()
    private Condition unpaused= lock.newCondition();



    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    //每次执行之前, 都调用这个方法, 用来查看线程池是否已经暂停
    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);

        //先拿到一把锁
        lock.lock();

        try {
            while(isPaused){ //如果当前线程池已经暂停了, 则将当前线程休眠
                unpaused.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//最后释放锁
        }

    }

    //让线程池处于暂停状态
    public void pause(){
        lock.lock();
        try{
            isPaused=true;
        } finally {
            lock.unlock();
        }
    }

    //重新启用线程池
    public void resume() {
        lock.lock();//上锁
        try{
            isPaused=false;//设置标记位
            unpaused.signalAll();//唤醒休眠的线程
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        PauseableThreadPool threadPool =new PauseableThreadPool(1, 1,0,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        for (int i = 0; i < 10; i++) {
            threadPool.execute(new SimpleTask5());
        }

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.pause();
        System.out.println("线程池被暂停");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.resume();
        System.out.println("线程池被恢复");

        //关闭线程池的
        threadPool.shutdown();
        
    }

}
