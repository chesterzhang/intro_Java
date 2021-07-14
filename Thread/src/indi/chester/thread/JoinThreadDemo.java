package indi.chester.thread;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {



        JoinThread jt1= new JoinThread();
        Thread t1=new Thread(jt1,"join thread 1");
        t1.start();

        //在主线程中 调用 t1 线程, t1 线程使用join方法, 主线程被阻塞
        t1.join();

        for (int i = 0; i < 20; i++) {
            System.out.println("main thread 正在运行"+"第"+i+"次for循环.");
        }



    }
}
