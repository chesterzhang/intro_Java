package indi.chester.builder;

public class Phone {

    private String ram;//必须指定
    private String rom;//必须指定
    private String screen;//标准配置
    private String battery;//标准配置
    private String cpu;//标准配置

    public Phone(String ram, String rom) {
        this.ram = ram;
        this.rom = rom;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", screen='" + screen + '\'' +
                ", battery='" + battery + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
