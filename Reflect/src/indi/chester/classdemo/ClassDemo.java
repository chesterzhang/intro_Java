package indi.chester.classdemo;
import indi.chester.classdemo.Employee;

public class ClassDemo {
    public static void main(String[] args) {

        try {
            //将 指定 类加载到 JVM, 并返回Class 对象
            Class empClass = Class.forName("indi.chester.classdemo.Employee");

            // 通过 Class 对象.newInstance() 调用默认无参构造函数 进行实例化
            Employee  emp1=(Employee ) empClass.newInstance();
            System.out.println(emp1);

        } catch (ClassNotFoundException e) {// 找不到类 异常
            e.printStackTrace();
        } catch (InstantiationException e) {// 无法实例化 异常
            e.printStackTrace();
        } catch (IllegalAccessException e) {// 无法访问 异常
            e.printStackTrace();
        }


    }
}
