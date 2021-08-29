package indi.chester.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

//两个线程打印日期, 没有问题
public class normalUsage00 {

    //参数单位 毫秒, 返回自1970.01.01 00:00:00 GMT 计时
    public String date(int seconds){
        Date date = new Date(1000*seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String date= new normalUsage00().date(10);
                System.out.println(date);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                String date= new normalUsage00().date(1007);
                System.out.println(date);
            }
        }).start();

    }

}
