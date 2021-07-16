package indi.chester.classdemo;

public class Employee {
    private int empno;
    private String empname;

    static {
        System.out.println("类已被加载到JVM");
    }

    public Employee( ) {
        System.out.println("默认构造方法被执行");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                '}';
    }

}
