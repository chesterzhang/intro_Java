package indi.chester.spring.aop.service;

import indi.chester.spring.aop.dao.EmployeeDao;

//员工服务
public class EmployeeService {
    private EmployeeDao employeeDao;
    public void entry(){
        System.out.println("执行员工入职业务逻辑");
        employeeDao.insert();
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

}
