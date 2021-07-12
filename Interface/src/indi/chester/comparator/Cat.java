package indi.chester.comparator;

public class Cat {

    private String name;
    private int month;

    public Cat(String name, int month) {
        this.name = name;
        this.month = month;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //重写object类的toString方法，详见java文档 java.base.lang object类
    @Override
    public String toString() {
        return "name=" + name + ", month=" + month ;
    }

}
