package indi.chester.fileddemo;

public class Employee {
    private int empno;
    private String empname;
    public String dname;

    static {
        System.out.println("类已被加载到JVM");
    }

    public Employee(int empno, String empname,String dname  ) {
        this.empno = empno;
        this.empname = empname;
        this.dname=dname;
        System.out.println("带参构造方法被执行");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }
}
