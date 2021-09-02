package indi.chester.threadlocal;

import java.text.SimpleDateFormat;

public class ThreadSafeDateFormatter {

    public  static ThreadLocal<SimpleDateFormat> dFThreadLocal =new ThreadLocal<SimpleDateFormat>(){

        //ThreadLocal对象生成时机不同, 可以选择 重写 initialValue() 方法或者  对象.set() 来初始
        //使用initialValue() 会在第一次 对象.get() 的时候把对象初始化出来
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }


    };


}
