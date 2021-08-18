package indi.chester.producer_consumer;

//用于创建 消费者 线程
public class Consumer implements Runnable{
    private GoodsPipe goodsPipe;

    public Consumer(GoodsPipe goodsPipe) {
        this.goodsPipe = goodsPipe;
    }

    //模拟消费产品
    @Override
    public void run() {
        while (true){
            goodsPipe.pick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
