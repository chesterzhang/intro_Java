package indi.chester.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/t") // 绑定 Get 请求 "http://localhost:8080/t" 就可以访问到
    @ResponseBody //直接向响应输出字符串数据, 不跳转界面
    public String test(){
        return "<h1> SUCCESS </h1>";
    }
}
