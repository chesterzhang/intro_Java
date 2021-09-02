package indi.chester.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ThreadLocal 有两个作用:
//1. 线程隔离, 给每个线程都分配一个独立的对象, 避免多个线程之间队资源进行抢占
//2.

// 利用 threadlocal 给每个线程池中的线程分配一个 dateFormat
public class normalUsage05 {

    //参数单位 毫秒, 返回自1970.01.01 00:00:00 GMT 计时
    public String date(int seconds){
        Date date = new Date(1000*seconds);

        //第一次 对象.get() 就调用 initialValue() 将ThreadLocal 初始化
        SimpleDateFormat sDF=ThreadSafeDateFormatter.dFThreadLocal.get();
        String s =sDF.format(date);
        dateSet.add(s);
        return s;
    }

    public  static ExecutorService threadPool= Executors.newFixedThreadPool(10);
    public  static HashSet<String> dateSet= new HashSet<>();

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            final int finalI =i ;

            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    String date= new normalUsage05().date(finalI);
                    System.out.println(date);
                }
            });
        }
        threadPool.shutdown();
        while (!threadPool.isTerminated()){

        }
        System.out.println(dateSet.size());
    }


}


