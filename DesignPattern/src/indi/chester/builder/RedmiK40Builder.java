package indi.chester.builder;

public class RedmiK40Builder extends PhoneBuilder{
    private Phone phone;

    public RedmiK40Builder(String ram, String rom) {
        this.phone = new Phone(ram,rom);
    }

    @Override
    public void setScreen() {
        phone.setScreen("6.67");
    }

    @Override
    public void setBattery() {
        phone.setBattery("4520mAh");
    }

    @Override
    public void setCPU() {
        phone.setCPU("870");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }

}
