package indi.chester.spring.ioc.entity;

public class Apple {
    private String title;
    private String color;
    private String origin;
    private float price;

    public Apple(String title, String color, String origin) {
        System.out.println("使用带参构造方法(3个参数)创建对象," + this);
        this.title = title;
        this.color = color;
        this.origin = origin;
    }

    public Apple(String title, String color, String origin, float price) {
        System.out.println("使用带参构造方法(4个参数)创建对象 : " + this);
        this.title = title;
        this.color = color;
        this.origin = origin;
        this.price = price;
    }

    public Apple() {
        System.out.println("使用无参构造方法创建对象 : " + this);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("title 属性设置为 : "+title);
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


}
