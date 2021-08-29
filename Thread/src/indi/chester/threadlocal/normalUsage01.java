package indi.chester.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

//使用 for 循环 创建10个线程打印日期
public class normalUsage01 {

    //参数单位 毫秒, 返回自1970.01.01 00:00:00 GMT 计时
    public String date(int seconds){
        Date date = new Date(1000*seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            final int finalI =i ;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String date= new normalUsage00().date(finalI);
                    System.out.println(date);
                }
            }).start();
        }





    }

}
