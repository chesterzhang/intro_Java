package indi.chester.builder;

public class Xiaomi11Builder extends PhoneBuilder {

    private Phone phone;

    public Xiaomi11Builder(String ram, String rom) {
        this.phone = new Phone(ram,rom);
    }

    @Override
    public void setScreen() {
        phone.setScreen("6.81");
    }

    @Override
    public void setBattery() {
        phone.setBattery("4600mAh");
    }

    @Override
    public void setCPU() {
        phone.setCPU("888");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }

}
