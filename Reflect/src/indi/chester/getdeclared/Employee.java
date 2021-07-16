package indi.chester.getdeclared;

public class Employee {
    private int empno;
    public String empname;

    static {
        System.out.println("类已被加载到JVM");
    }

    public Employee(int empno, String empname) {
        this.empno = empno;
        this.empname = empname;

        System.out.println("带参构造方法被执行");
    }

    public int getEmpno() {
        return empno;
    }
}
