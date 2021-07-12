package indi.chester.comparabledemo;

public class Goods implements Comparable<Goods>{

    private String name;// 商品名称
    private double price;// 商品价格

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 对商品进行降序排序
    @Override
    public int compareTo(Goods g) {
        // 将当前对象与传入对象的成员属性进行比较
        // 返回负数若this.成员 < arg.成员, 返回0若相等, 返回正数若this.成员>arg.成员
        double price1 = this.getPrice();
        double price2 = g.getPrice();

        //因为是降序, 故取反
        int n = new Double(price2 - price1).intValue();
        return n;
    }

    @Override
    public String toString() {
        return "商品: " + name + ", 价格: " + price ;
    }


}
