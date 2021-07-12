package indi.chester.interfacedemo;

public interface IWIFI extends INet{
    default void connect() {
        System.out.println("使用WIFI上网");
    }
}
