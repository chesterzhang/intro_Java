package indi.chester.controller;

import indi.chester.entity.Student;
import indi.chester.utils.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

    @RequestMapping("json_result")// http://localhost:8090/demo/hello
    public Object getJSONObj(){
        return JSONResult.ok(new Student("Tom",60));
    }
}
