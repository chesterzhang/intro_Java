package indi.chester.restful.controller;


import indi.chester.restful.entity.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController  //不跳转页面
@RequestMapping("/restful")
//@CrossOrigin(origins = {"http://localhost:90"})//跨域名访问
//@CrossOrigin(origins = {"*"},maxAge = 3600)//允许所有地址跨域名访问, 保留3600s的预检请求返回结果(是否支持put,delete)
public class RestfulController {
    @GetMapping("/request")
    public String deGetRequest(){
        return "{\"message\":\"返回查询结果\"}";
    }

    @PostMapping("/request/{rid}")//添加路径变量
    public String dePostRequest(@PathVariable("rid") Integer requestId, Person person){
        System.out.println(person.getName()+" : "+person.getAge());
        return "{\"message\":\"数据新增成功\",\"id\":"+requestId+"}";
    }

    @PutMapping("/request")
    public String dePutRequest( Person person){
        System.out.println(person.getName()+" : "+person.getAge());
        return "{\"message\":\"数据更新成功\"}";
    }

    @DeleteMapping("/request")
    public String deDeleteRequest( Person person){
        System.out.println(person.getName()+" : "+person.getAge());
        return "{\"message\":\"数据删除成功\"}";
    }

    //json 序列化, 自动地将成员变量与值一一对应成 json 数据
    @GetMapping("/person")
    public Person findByPerson(Integer id){
        Person p = new Person();
        if (id==1){
            p.setName("Tony");
            p.setAge(20);
        }
        return p;
    }

    //json 序列化, 自动地将成员变量的集合 转化成 json 数据
    @GetMapping("/persons")
    public List<Person> findPersons(){
        List list= new ArrayList();
        Person p1= new Person();
        p1.setName("Tony");
        p1.setAge(20);
        p1.setBirthday(new Date());
        Person p2= new Person();
        p2.setName("Smith");
        p2.setAge(30);
        p2.setBirthday(new Date());
        list.add(p1);
        list.add(p2);
        System.out.println("RestfulController.findPersons() - return list");
        return list;
    }

}
