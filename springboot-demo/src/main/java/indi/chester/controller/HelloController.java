package indi.chester.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // RestController 等于 Controller + ResponseBody 注解
public class HelloController {

    @RequestMapping("hello")// http://localhost:8090/hello
//    @ResponseBody//直接向响应输出字符串数据, 不跳转界面
    public String hello(){
        return  "<h1> Hello, SpringBoot ! </h1>";
    }



}
