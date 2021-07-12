package indi.chester.interfacedemo;

public interface ICharger {
    int maxVoltage=220;//220伏 充电电压

    static void chargerVoltage() {
        System.out.println("默认充电电压 : "+maxVoltage +" V");
    }

    //非static, 非default 函数,一定要重写
    void chargerType() ;
}
