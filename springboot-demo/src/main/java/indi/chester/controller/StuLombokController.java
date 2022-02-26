package indi.chester.controller;


import indi.chester.entity.StudentLombok;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StuLombokController {
    @GetMapping("getStuLombok")
    public Object getStuLombok(){
        StudentLombok stulb=new StudentLombok();
        stulb.setAge(5);
        stulb.setName("Mike");

        log.debug(stulb.toString());
        log.info(stulb.toString());
        log.warn(stulb.toString());
        log.error(stulb.toString());

        return  stulb;
    }
}
