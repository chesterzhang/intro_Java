package indi.chester.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/um") //若写到 方法上面, 则说明不区分 get, post 请求, 不推荐
public class URLMappingController {
    @GetMapping("/g") // "http://localhost:8080/um/t"
    @ResponseBody
    public String getMapping(){
        return "<h1> This is get method </h1>";
    }

    @PostMapping("/p") // "http://localhost:8080/um/p"
    @ResponseBody
    public String postMapping(){
        return "<h1> This is post method </h1>";
    }

}
