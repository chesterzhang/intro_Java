package indi.chester.springmvc.controller;

import indi.chester.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/um") //若写到 方法上面, 则说明不区分 get, post 请求, 不推荐
public class URLMappingController {
    @GetMapping("/g") // "http://localhost:8080/um/t"
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName){//使用 @RequestParam 对 下划线命名 和 驼峰命名进行映射
        System.out.println("manager name : "+ managerName);
        return "<h1> This is get method </h1>";
    }

    @PostMapping("/p") // "http://localhost:8080/um/p"
    @ResponseBody
    public String postMapping(String  username, Long password){
        System.out.println(username + " : "+password);
        return "<h1> This is post method </h1>";
    }

    @PostMapping("/p1") // "http://localhost:8080/um/p1"
    @ResponseBody
    public String postMapping1(User user){//只要成员属性名与 前端name 相同,就可以直接创建对象
        System.out.println(user.getUsername() + " : " + user.getPassword());
        return "<h1> This is post method </h1>";
    }

}
