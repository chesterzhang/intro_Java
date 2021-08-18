package indi.chester.synchronization;
//用于解释线程间同步
//模拟存取款业务时,由于线程间不同步,导致账户余额出错

public class Bank {

    private String account;// 账号
    private int balance;// 账户余额

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    //获取账户信息
    public String getAccount() {
        return account;
    }

    //获取余额
    public int getBalance() {
        return balance;
    }

    //设置余额
    public void setBalance(int balance) {
        this.balance = balance;
    }


    // 模拟存款操作,一次存款100元, 使用线程同步
    //对当前函数进行上锁,函数内的资源不允许被其他线程访问
    public synchronized void saveMoney() {
        // 获取当前账户余额
        int balance = this.getBalance();

        // 修改余额,加100元
        balance = balance + 100;

        // 故意让进程阻塞1秒,用来引诱调用另一个线程
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 修改账户余额
        this.setBalance(balance);

        // 输出现在的余额
        System.out.println("存款100后账户余额为 : " + this.getBalance());

    }

    // 模拟取款操做, 一次取200, 使用线程同步
    public void withdrawMoney() {
        //synchronized(obj){代码块}
        //对obj对象内的 资源 进行上锁, 其他线程不允许访问

        synchronized (this) {
            // 获取当前账户余额
            int balance = this.getBalance();

            balance = balance - 200;

            // 故意让进程阻塞1秒,用来引诱调用另一个线程
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // 修改账户余额
            this.setBalance(balance);

            // 输出现在的余额
            System.out.println("取款200后账户余额为 : " + this.getBalance());
        }

    }

    @Override
    public String toString() {
        return "Bank [账户 : " + account + ", 余额 : " + balance + "]";
    }

}
