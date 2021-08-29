package indi.chester.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//100 个线程 输出时间, 使用线程池, 将  dateFormat 设置成静态,  加锁

public class normalUsage04 {

    //参数单位 毫秒, 返回自1970.01.01 00:00:00 GMT 计时
    public String date(int seconds){
        Date date = new Date(1000*seconds);
        String s=null;
        synchronized (normalUsage04.class){
            s =dateFormat.format(date);
        }

        return s;
    }

    public  static ExecutorService threadPool= Executors.newFixedThreadPool(10);

    public  static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static void main(String[] args) {



        for (int i = 0; i < 1000; i++) {
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
        while (!threadPool.isTerminated()){

        }


    }

}
