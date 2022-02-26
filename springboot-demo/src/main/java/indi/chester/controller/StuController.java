package indi.chester.controller;

import indi.chester.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {

    @Autowired //Autowire 注解相当于从IoC 容器中取出一个 bean
    private Student stu1;

    @Autowired //Autowire 注解相当于从IoC 容器中取出一个 bean
    private Student stu2;

    @GetMapping("getStu1")
    public Object getStu(){
        return stu1;
    }

    @GetMapping("getStu2")
    public Object getStu2(){
        return stu2;
    }
}
