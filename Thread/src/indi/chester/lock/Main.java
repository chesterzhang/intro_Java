package indi.chester.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


// 三个线程, 轮流打印 ABC
public class Main{

    public static void main(String[] args) {

        PrintABC printABC= new PrintABC();
        ThreadA tA=new ThreadA(printABC);
        ThreadB tB=new ThreadB(printABC);
        ThreadC tC=new ThreadC(printABC);

        Thread t1 =new Thread(tA);
        Thread t2 =new Thread(tB);
        Thread t3 =new Thread(tC);
        t1.start();
        t2.start();
        t3.start();
        
    }

}

class ThreadA implements Runnable{
    private PrintABC printABC;

    public ThreadA(PrintABC printABC) {
        this.printABC = printABC;
    }

    @Override
    public void run() {
        printABC.printA();
    }
}

class ThreadB implements Runnable{
    private PrintABC printABC;

    public ThreadB(PrintABC printABC) {
        this.printABC = printABC;
    }

    @Override
    public void run() {
        printABC.printB();
    }
}

class ThreadC implements Runnable{
    private PrintABC printABC;

    public ThreadC(PrintABC printABC) {
        this.printABC = printABC;
    }

    @Override
    public void run() {
        printABC.printC();
    }
}

class PrintABC{

    private  Lock lock = new ReentrantLock();
    private  Condition condition = lock.newCondition();
    private  volatile int flag = 1; // 用来标记打印几, 若为1打印'A', 若为2打印'B', 若为3打印'C'


    public void printA(){

        for (int i = 0; i < 10; i++) {
            lock.lock();
            try {
                while (flag != 1) {
                    condition.await();// 释放当前的锁并等待
                }
                System.out.println("A");
                flag = 2;// flag 设置为2
                condition.signalAll();
            } catch (Exception e) {

            } finally {
                lock.unlock();
            }
        }

    }

    public void printB(){
        for (int i = 0; i < 10; i++) {
            lock.lock();
            try {
                while (flag != 2) {
                    condition.await();// 释放当前的锁并等待
                }
                System.out.println("B");
                flag = 3;// flag 设置为2
                condition.signalAll();
            } catch (Exception e) {

            } finally {
                lock.unlock();
            }
        }
    }

    public void printC(){
        for (int i = 0; i < 10; i++) {
            lock.lock();
            try {
                while (flag != 3) {
                    condition.await();// 释放当前的锁并等待
                }
                System.out.println("C");
                flag = 1;// flag 设置为1
                condition.signalAll();
            } catch (Exception e) {

            } finally {
                lock.unlock();
            }
        }
    }

}




