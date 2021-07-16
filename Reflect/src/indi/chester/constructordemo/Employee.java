package indi.chester.constructordemo;

public class Employee {
    private int empno;
    private String empname;

    static {
        System.out.println("类已被加载到JVM");
    }

    public Employee(int empno, String empname ) {
        this.empno = empno;
        this.empname = empname;
        System.out.println("带参构造方法被执行");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                '}';
    }

}
