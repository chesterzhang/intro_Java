package indi.chester.threadlocal;

import java.text.SimpleDateFormat;

public class ThreadSafeDateFormatter {

    public  static ThreadLocal<SimpleDateFormat> dFThreadLocal =new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
    };


}
