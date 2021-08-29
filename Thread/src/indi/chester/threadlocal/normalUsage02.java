package indi.chester.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//100 个线程 输出时间, 使用线程池
public class normalUsage02 {

    //参数单位 毫秒, 返回自1970.01.01 00:00:00 GMT 计时
    public String date(int seconds){
        Date date = new Date(1000*seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }

    public  static  ExecutorService threadPool= Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            final int finalI =i ;

            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    String date= new normalUsage00().date(finalI);
                    System.out.println(date);
                }
            });
        }
        threadPool.shutdown();
        
    }

}
