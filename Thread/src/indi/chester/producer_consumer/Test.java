package indi.chester.producer_consumer;

public class Test {

    public static void main(String[] args) {
        GoodsPipe pipe = new GoodsPipe();

        //生产者, 消费者 线程
        Thread p=new Thread(new Producer(pipe));
        Thread c=new Thread(new Consumer(pipe));

        //运行
        p.start();
        c.start();

    }

}

