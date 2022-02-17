package indi.chester.spring.ioc.entity;

public class Order {
    private  Float price;
    private Integer quantity;
    private Float total;

    public Order(){
        System.out.println("创建 Order 对象 : "+ this);
    }

    public void calTotal(){
        System.out.println("执行 calTotal 方法 ");
        total = price * quantity;
    }

    public void destroy(){
        System.out.println("订单销毁方法");
    }

    public void pay(){
        System.out.println("支付订单金额为 : "+total);
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        System.out.println("setPrice 方法");
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        System.out.println("sestQuantitive 方法");
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}
