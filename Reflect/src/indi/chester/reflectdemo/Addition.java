package indi.chester.reflectdemo;


//加法
public class Addition implements MathOperation {
    @Override
    public float operate(int a , int b) {
        System.out.println("执行加法运算");
        return a + b;
    }
}
