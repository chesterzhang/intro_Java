package indi.chester.interfacedemo;

public interface ISIM extends INet{
    default void connect() {
        System.out.println("我使用SIM卡上网");
    }
}
