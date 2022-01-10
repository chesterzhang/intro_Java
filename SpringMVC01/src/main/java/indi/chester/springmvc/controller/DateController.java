package indi.chester.springmvc.controller;

import indi.chester.springmvc.entity.DateEntity;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class DateController {

    @GetMapping("/date_handler1")
    @ResponseBody
    //@DateTimeFormat 注解 用来指定日期 格式
    public String dateHandler1( @DateTimeFormat( pattern = "yy-MM-dd") Date date ){
        return "<h1>"+ date.toString()+  "</h1>";
    }

    @GetMapping("/date_handler2")
    @ResponseBody
    // 使用实体对象接收日期
    public String dateHandler2(DateEntity dE){
        return "<h1>"+ dE.getDate().toString()+  "</h1>";
    }

    @GetMapping("/date_handler3")
    @ResponseBody
    // 使用实体对象接收日期
    public String dateHandler3(Date date){
        return "<h1>"+ date.toString()+  "</h1>";
    }

}
