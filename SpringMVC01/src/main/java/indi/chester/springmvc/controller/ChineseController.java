package indi.chester.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ChineseController {
    @GetMapping("/getChinese")
    @ResponseBody
    public String getChinese( String username ){
        System.out.println(username);
        return "<h1>"+ username  +  "</h1>";
    }

    @PostMapping("/postChinese")
    @ResponseBody
    public String postChinese( String username ){
        System.out.println(username);
        return "<h1>"+ username  +  "</h1>";
    }
}
