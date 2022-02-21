package indi.chester.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/um") //若写到 方法上面, 则说明不区分 get, post 请求, 不推荐
public class URLMappingController {

    @GetMapping("/g") // "http://localhost:8080/um/g"
    @ResponseBody
    public String getMapping() {//使用 @RequestParam 对 下划线命名 和 驼峰命名进行映射
        return "<h1> This is get method </h1>";
    }

    @PostMapping("/p") // "http://localhost:8080/um/p"
    @ResponseBody
    public String postMapping(){
        return "<h1> This is post method </h1>";
    }

}
