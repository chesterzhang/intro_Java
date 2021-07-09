package indi.chester.synchronization;

//对银行账户进行存款操作 的 线程
public class SaveThread implements Runnable{

    Bank bank;

    public SaveThread (Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        this.bank.saveMoney();
    }
}
