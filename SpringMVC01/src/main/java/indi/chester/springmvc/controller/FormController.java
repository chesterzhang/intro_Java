package indi.chester.springmvc.controller;


import indi.chester.springmvc.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FormController {
    @PostMapping("/apply1")
    @ResponseBody //直接向响应输出字符串数据, 不跳转界面
    //若果 name 值不为 n, 则后端给一个默认值 anomoly
    public String apply1(@RequestParam(value = "n",defaultValue = "anomaly") String name, String course, Integer[] purpose){
        System.out.println(name);
        System.out.println(course);
        for (Integer p : purpose){
            System.out.println(p);
        }
        return "<h1> Form Controller SUCCESS </h1>";
    }

    // 改用 list
    @PostMapping("/apply2")
    @ResponseBody //直接向响应输出字符串数据, 不跳转界面
    //若果 name 值不为 空, 则后端给一个默认值 anomoly
    public String apply2(@RequestParam(defaultValue = "anomaly") String name, String course, @RequestParam List<Integer> purpose){
        System.out.println(name);
        System.out.println(course);
        for (Integer p : purpose){
            System.out.println(p);
        }
        return "<h1> Form Controller SUCCESS </h1>";
    }

    // 改用 实体类 接收
    @PostMapping("/apply3")
    @ResponseBody //直接向响应输出字符串数据, 不跳转界面
    public String apply3( Form form){
        System.out.println(form.getName() );
        System.out.println(form.getCourse());
        for (Integer p : form.getPurpose()){
            System.out.println(p);
        }
        return "<h1> Form Controller SUCCESS </h1>";
    }

    // 改用 Map 接收, key为参数名, value为参数值, 无法接收复合数据, 会丢失
    @PostMapping("/apply4")
    @ResponseBody //直接向响应输出字符串数据, 不跳转界面
    public String apply4( Form form){
        System.out.println(form.getName() );
        System.out.println(form.getCourse());
        for (Integer p : form.getPurpose()){
            System.out.println(p);
        }
        return "<h1> Form Controller SUCCESS </h1>";
    }

    // 接受 符合类 数据, 对象里面包含有别的对象
    @PostMapping("/apply5")
    @ResponseBody //直接向响应输出字符串数据, 不跳转界面
    public String apply5( Form form){
        System.out.println(form.getName() );
        System.out.println(form.getCourse());
        for (Integer p : form.getPurpose()){
            System.out.println(p);
        }
        System.out.println(form.getDelivery().getName());
        System.out.println(form.getDelivery().getMobile());
        System.out.println(form.getDelivery().getAddress());
        return "<h1> Form Controller SUCCESS </h1>";
    }


}
