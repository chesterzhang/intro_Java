package indi.chester.builder;

public abstract class PhoneBuilder {
    public abstract void setScreen();

    public abstract void  setBattery();

    public abstract void setCPU();

    public abstract Phone getPhone();
}
