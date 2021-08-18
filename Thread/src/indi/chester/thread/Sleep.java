package indi.chester.thread;

import java.util.Date;
import java.util.Timer;

//演示Sleep()方法,将线程切换到 阻塞状态
public class Sleep  implements  Runnable {

    @Override
    public void run() {

        for (int i=0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+"第"+i+"次for循环."
            + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
