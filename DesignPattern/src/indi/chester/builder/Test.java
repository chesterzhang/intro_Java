package indi.chester.builder;

public class Test {

    public static void main(String[] args) {
        PhoneDirector director=new PhoneDirector();

        PhoneBuilder builder=new RedmiK40Builder("8G","128G");
        director.makePhone(builder);
        Phone redmiK40=builder.getPhone();
        System.out.println("redmiK40 " +redmiK40);

        builder=new Xiaomi11Builder("12G","256G");//2
        director.makePhone(builder);
        Phone xiaomi11=builder.getPhone();
        System.out.println("xiaomi11 " +xiaomi11);

    }

}
