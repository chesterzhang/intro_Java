package indi.chester.synchronization;

public class BankTest {
    public static void main(String[] args) {
        //创建账户, 给定金额为1000
        Bank bank=new Bank("123456789", 1000);

        //创建存款, 取款 对象
        SaveThread save= new SaveThread(bank);
        WithdrawThread withdraw= new WithdrawThread(bank);

        //创建存款, 取款 线程
        Thread saveThread=new Thread(save);
        Thread withdrawThread= new Thread(withdraw);

        saveThread.start();
        withdrawThread.start();

        //这里用join表示希望先存取款,然后再打印银行余额
        try {
            saveThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(bank);
    }

}


