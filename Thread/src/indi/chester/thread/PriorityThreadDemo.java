package indi.chester.thread;

//java给线程类提供了10个优先级
//优先级可以用整数1-10表示,1最低,10 最高
//主线程默认5
//优先级常量


public class PriorityThreadDemo {

    public static void main(String[] args) {
        int mainPriority = Thread.currentThread().getPriority();
        System.out.println("主线程的优先级为:"+mainPriority);

        Priority  pt =new Priority ();

        Thread t1= new Thread(pt,"t1");
        t1.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);//和上一句等价

        Thread t2= new Thread(pt,"t2");
        t2.setPriority(Thread.MAX_PRIORITY );//和上一句等价

        t1.start();
        t2.start();

        //优先级设置后,运行的顺序并不绝对,依然由操作系统决定

    }
}
