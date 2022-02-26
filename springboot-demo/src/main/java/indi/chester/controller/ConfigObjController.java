package indi.chester.controller;

import indi.chester.entity.MyConfigObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigObjController {
    @Autowired //Autowire 注解相当于从IoC 容器中取出一个 bean
    private MyConfigObj myConfigObj;

    @GetMapping("getMyConfigObj")
    public Object getMyConfigObj(){
        return myConfigObj;
    }
}
