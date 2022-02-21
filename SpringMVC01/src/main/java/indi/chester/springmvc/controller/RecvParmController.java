package indi.chester.springmvc.controller;

import indi.chester.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecvParmController {

    @GetMapping("/recv_parm/g") // "http://localhost:8080/recv_parm/g"
    @ResponseBody
    public String getMapping(@RequestParam("username") String username, @RequestParam("password") String password ){//使用 @RequestParam 对 下划线命名 和 驼峰命名进行映射
        System.out.println(username + " : "+password);
        return "<h1>" + "username : "+ username + " , "+ "password : "+ password +  "</h1>";
    }

    @PostMapping("/recv_parm/p1") // "http://localhost:8080/recv_parm/p1"
    @ResponseBody
    public String postMapping1(@RequestParam("username") String username, @RequestParam("password") String password ){
        return "<h1>" + "username : "+ username + " , "+ "password : "+ password +  "</h1>";
    }

    @PostMapping("/recv_parm/p2") // "http://localhost:8080/recv_parm/p2"
    @ResponseBody
    public String postMapping2(User user){//只要成员属性名与 前端name 相同,就可以直接创建对象
        return "<h1>" + "username : "+ user.getUsername() + " , "+ "password : "+ user.getPassword() +  "</h1>";
    }

}
