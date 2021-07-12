package indi.chester.interfacedemo;

public class SmartPhone implements ICharger,IWIFI,ISIM {
    @Override
    public void chargerType() {
        System.out.print("智能手机使用两孔充电器,");
        ICharger.chargerVoltage();
    }

    @Override
    public void connect() {
        System.out.println("智能手机使用 WIFI 和 SIM卡 上网");
    }

}
