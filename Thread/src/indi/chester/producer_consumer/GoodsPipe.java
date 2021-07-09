package indi.chester.producer_consumer;

//生产者-消费者 模型
//我们希望生产一个,消费一个
//传送带上没有商品,唤醒生产者生产一个
//传送带上有商品,唤醒消费者消费一个

public class GoodsPipe {

    private int n;//商品数量
    boolean hasGood;

    public GoodsPipe(){
        n=0;
        hasGood=false;
    }

    //向传送带上放一个商品
    //我们希望放入产品时,不会中途取出一个产品,导致产品数量出错
    public synchronized void send()  {
        if (hasGood){//当传送带上有商品时,不需要生产,等待消费
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            n++;
            hasGood=true;
            System.out.println("生产 一个商品,还剩"+n+"个商品");
            notifyAll();//唤醒消费者
        }
    }

    //从传送带上去一个商品
    //我们希望取出产品时,不会中途放入一个产品,导致产品数量出错
    public synchronized void pick() {
        if (! hasGood){//如果没有商品,无法消费,等待生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            n--;
            hasGood=false;
            System.out.println("消费 一个商品,还剩"+n+"个商品");
            notifyAll();//唤醒生产者
        }

    }

}

