package indi.chester.thread;

public class EasyThreadDemo {
    public static void main(String[] args) {
        EasyThread mt1=new EasyThread("mt1");
        mt1.start();//启动线程, star()方法去启动run()方法

        EasyThread mt2=new EasyThread("mt2");
        mt2.start();



    }
}
