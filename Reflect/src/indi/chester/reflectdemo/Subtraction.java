package indi.chester.reflectdemo;


//减法
public class Subtraction implements  MathOperation{
    @Override
    public float operate(int a, int b) {
        System.out.println("执行减法运算");
        return a - b;
    }
}

