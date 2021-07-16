package indi.chester.methoddemo;

public class Employee {
    private int empno;
    private String empname;
    private int salary;

    static {
        System.out.println("类已被加载到JVM");
    }

    public Employee(int empno, String empname, int salary) {
        this.empno = empno;
        this.empname = empname;
        this.salary = salary;
        System.out.println("带参构造方法被执行");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void updateSal(int val){
        salary+=val;
        System.out.println(empname + "调薪至: " + salary +"元");

    }


}
