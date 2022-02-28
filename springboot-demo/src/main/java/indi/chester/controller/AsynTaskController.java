package indi.chester.controller;

import indi.chester.utils.AsynTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AsynTaskController {
    @Autowired
    private AsynTask asynTask;

    @GetMapping("asyn_task")
    public Object startAsynTask(){
        asynTask.publishMsg();
        log.info("跳过异步任务执行");
        return null;
    }

}
