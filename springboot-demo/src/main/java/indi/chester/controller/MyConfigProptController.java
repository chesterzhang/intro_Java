package indi.chester.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConfigProptController {

    @Value("${xxx.yyy.host}")
    private String host;

    @Value("${xxx.yyy.port}")
    private String port;

    @GetMapping("getMyConfigPropt")
    public Object getMyConfigPropt(){
        return host+" , " + port;
    }

}
