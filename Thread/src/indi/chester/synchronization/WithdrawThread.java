package indi.chester.synchronization;

// 从银行账户中 取款的线程
public class WithdrawThread implements Runnable{
    Bank bank;

    public WithdrawThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        this.bank.withdrawMoney();
    }

}
