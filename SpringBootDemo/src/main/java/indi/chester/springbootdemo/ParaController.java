package indi.chester.springbootdemo;

import org.springframework.web.bind.annotation.*;

//演示各种传参形式
@RestController//restful 风格
@RequestMapping("/prefix")//URL 统一前缀
public class ParaController  {
    @GetMapping("/first_request")
    public String firstRequest(){
        return "第一个Spring Boot 接口";
    }

    @GetMapping("/request_para")
    public String requestPara(@RequestParam Integer num){
        return "para from request : " + num;
    }

    @GetMapping("/para/{num}")
    public String pathPara(@PathVariable Integer num){
        return "para from path : " + num;
    }

    @GetMapping({"/multi_url1","/multi_url2"})//通过多个URL访问同一个 controller 方法
    public String multiURL(@RequestParam   Integer num){
        return "para from multi URL : " + num;
    }

    @GetMapping("/unrequired")
    public String unrequiredPara(@RequestParam(required = false,defaultValue = "-1") Integer num){
        return "para from request : " + num;
    }


}
