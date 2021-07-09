package indi.chester.producer_consumer;

//生产者 线程
public class Producer implements  Runnable{
    private GoodsPipe goodsPipe;

    public Producer(GoodsPipe goodsPipe) {
        this.goodsPipe = goodsPipe;
    }

    //模拟生产商品
    @Override
    public void  run() {
        //不停地向传送带上送商品
        while(true){
            goodsPipe.send();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
