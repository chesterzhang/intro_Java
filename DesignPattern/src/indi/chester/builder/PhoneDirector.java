package indi.chester.builder;

public class PhoneDirector {
    public void makePhone(PhoneBuilder  builder){
        builder.setBattery();
        builder.setCPU();
        builder.setScreen();
    }
}
