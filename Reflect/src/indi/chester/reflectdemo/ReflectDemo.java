package indi.chester.reflectdemo;

import java.util.Scanner;

public class ReflectDemo {

    //不使用 反射, 在编译时决定创建哪几个对象
    public static void case1(){

        System.out.print("请输入四则运算名:");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.next();
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.print("请输入b:");
        int b = scanner.nextInt();
        MathOperation mathOperation = null;
        if(op.equals("Addition")){
            mathOperation = new Addition();
        }else if(op.equals("Subtraction")) {
            mathOperation = new Subtraction();
        }else{
            System.out.println("无效的计算类");
            return;
        }
        float result = mathOperation.operate(a, b);
        System.out.println(result);
    }

    //使用 反射, 动态创建类
    public static void case2(){

        System.out.print("请输入运算名:");
        Scanner scanner = new Scanner(System.in);

        String op = scanner.next();
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.print("请输入b:");
        int b = scanner.nextInt();
        MathOperation mathOperation = null;

        //用反射 机制 动态决定 创建哪一个 对象
        try {
            mathOperation = (MathOperation) Class.forName("indi.chester.reflectdemo." + op).newInstance();
        }catch(Exception e){
            System.out.println("无效的计算类");
            return;
        }
        float result = mathOperation.operate(a, b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        case2();

    }
}
